# Examples of use of the Acceleo Equinox Launcher through Maven

Generating code on a server/as part of the CI is a common practice.

For such situations Acceleo provides the Acceleo Maven plugin, but it can be hard to setup for the following reasons :

- the generator (and all its dependencies) should be working in *standalone* -- which can prove to be difficult or impossible if at least one of the dependency is not supporting this.
- this requires explict registration of EPackages and Resource factories, technical details which uses are not necessarly aware of as this is done automatically in an OSGi/Equinox context
- the generator has to be published itself in a Maven repository, which requires an infrastructure.

All these factors are especially relevant for our core user base which is fairly used to the Eclipse technologies, will generally distribute their generators alongside other tooling through p2 update-sites.

Since version 0.14, Tycho (which integrates Maven and Eclipse based technologies) provide a generic way to launch any Equinox application through the tycho-eclipserun-plugin. Tycho-eclipserun allow the definition of extra dependencies retrieved through p2. 

We recommend the use of the Acceleo Launcher with Tycho 0.24+ as this version made the specification of application arguments more rebust to spurious line endings.

From a runtime point of view, the application is launched in an equinox runtime and as such every "auto-wiring" of the EPackages and Resource factories would work out of the box in the exact same way they works in Eclipse.

The **Acceleo Equinox Launcher** can be dynamically provisionned by **Tycho** using a simple `pom.xml` and configured to:

* import projects in the workspace
* launch an Acceleo generator based on its qualified class name
* specify generation parameters as part of the `pom.xml`
* starts a `.launch` file
* starts the Java codegen from the **EMF core project**.


This repository contains a number of examples demonstrating how to use the Acceleo Equinox Launcher through.
Each example is independant and is in the sub-directory:

* [Obeo Designer HTML export](website-from-aird/): launches a generator with many dependencies (including UI ones) on a given modeling project. Here [is the result](https://hudson.eclipse.org/acceleo/job/acceleo-launcher-examples/4/artifact/website-from-aird/target/website/index.html) 

* [EMF Codegen](./emf-core-generation): launches the standard `.genmodel` based generation as part of a Maven build. The resulting generation should be perfectly identical as if launched from the right click action.

* [.launch file](./uml-to-java/): starts a `.launch` file. In this example the launch configuration is provided by the **UML 2 Java** generator.

* [All-in-One](./building-and-using-generator/): building a metamodel, a generator, and launching the generation on top of a dynamic instance as part of the Maven build. A scenario which is quite complex but enable a given development team to easily share a reproducible model driven process with no additional infrastructure.

# Configuration

The launcher can be configured using several arguments specified through `<args/>` tags in the `<applicationsArgs>` section.

```xml
<applicationsArgs>
    <args>-consoleLog</args>
    <args>-application</args>
    <args>org.eclipse.acceleo.equinox.AcceleoLauncher</args>
    <args>-data</args>
    <args>${project.build.directory}/wks</args>
    <args>-models</args>
    <args>https://git.eclipse.org/c/umlgen/org.eclipse.umlgen.git/plain/org.eclipse.umlgen.gen.embedded.c/tests/org.eclipse.umlgen.gen.embedded.c.tests/models/NonRegressionModel.uml</args>
    <args>-output</args>
    <args>./src-gen</args>
    <args>-actions</args>
    <args>generate:org.eclipse.umlgen.gen.embedded.c/org.eclipse.umlgen.gen.embedded.c.main.Uml2ec</args>
</applicationsArgs>

```

In order to launch a generator you need to make sure all its dependencies can be installed. This can be done by specifying p2 repositories:

```xml
<repositories>
    <repository>
      <id>Neon update site </id>
      <layout>p2</layout>
      <url>http://download.eclipse.org/releases/neon/</url>
    </repository>
    <repository>
      <id>Website Generator</id>
      <layout>p2</layout>
      <url>http://www.obeo.fr/download/release/designer/9.0/community/latest/repository
      </url>
    </repository>
</repositories>
```          
and then expliciting the dependencies

```xml
<dependencies>
    <!-- We need the actual launcher application -->
    <dependency>
      <artifactId>org.eclipse.acceleo.equinox.launcher
      </artifactId>
      <type>eclipse-feature</type>
    </dependency>
    <!-- The Eclipse feature packaging the code generator. -->
    <dependency>
      <artifactId>fr.obeo.dsl.designer.gen.html.feature
      </artifactId>
      <type>eclipse-feature</type>
    </dependency>
    <!-- The project containing the .aird model needs EcoreTools 
      to be resolved correctly -->
    <dependency>
      <artifactId>org.eclipse.emf.ecoretools.design</artifactId>
      <type>eclipse-feature</type>
	</dependency>
</dependencies>
```

A dependency which can't be resolved will lead to a failed build.


Please note that you can also specify dependencies on plugins without needing a Feature using the type **eclipse-plugin**:

```xml
<dependency>
  <artifactId>org.eclipse.mylyn.docs.intent.markup.gen</artifactId>
  <type>eclipse-plugin</type>
</dependency>

```
            

## -models URI1 URI2 

Specify the models to use as inputs of the generation. Relative paths might be used or absolute uris to target the host environment like `platform:/resource/someProject/model/someModel.ecore` for instance.

Several models can be specified when their URI are separated by spaces.

## -actions ACTION1 ACTION2

Specify the actions to execute, for instance `generate:org.generator.plugin.id/org.generator.plugin.ClassName` to launch an Acceleo code generator.

The action `launch:/NonRegressionModel/generateJavaFromUML.launch` can be used to start a .launch file.

The action `generate:org.eclipse.emf.codegen.ecore/org.eclipse.emf.codegen.ecore.generator.Generator` can be used to start the EMF Core Java code generation.


Several actions can be specified with their value separated by spaces.

## -data PATH

Specify the folder which will keep the workspace. The default value for this parameter is set by *Tycho* and is the current project folder, in our case it generally is a bad default value as that could easily lead to trying to import a project in a workspace which is in one of its sub-directories.

You should always specify this argument, the value `${project.build.directory}/wks` should work in most cases.

## -consoleLog

Log messages in the console. You should specify that flag in order to be able to troubleshoot any issue arising during the build.

## -output PATH

Specifiy the root folder to generate to, default is the application working folder.

This parameter might not be required depending on the generator.

## -projects-paths PATH

Specify paths to search for project and import those in the workspace.

## -jobs-wait-timeout INTEGER

Specify the duration before timeout when waiting for eclipse Jobs completion.

## -parameters P1 P2

Parameters to pass to the generators. They should be passed in the order they are expected from the generator. 
