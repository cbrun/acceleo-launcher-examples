# Examples of use of the Acceleo Equinox Launcher through Maven

Generating code on a server/as part of the CI is a common practice.

For such situations Acceleo provides the Acceleo Maven plugin, but it can be hard to setup for the following reasons :

- the generator (and all its dependencies) should be working in *standalone* -- which can prove to be difficult or impossible if at least one of the dependency is not supporting this.
- this requires explict registration of EPackages and Resource factories, technical details which uses are not necessarly aware of as this is done automatically in an OSGi/Equinox context
- the generator has to be published itself in a Maven repository, which requires an infrastructure.

All these factors are especially relevant for our core user base which is fairly used to the Eclipse technologies, will generally distribute their generators alongside other tooling through p2 update-sites.

Since version 0.14, Tycho (which integrates Maven and Eclipse based technologies) provide a generic way to launch any Equinox application through the tycho-eclipserun-plugin. Tycho-eclipserun allow the definition of extra dependencies retrieved through p2. 

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

