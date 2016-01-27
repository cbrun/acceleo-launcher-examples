/**
 */
package com.mycompany.devtool;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mycompany.devtool.Feature#getName <em>Name</em>}</li>
 *   <li>{@link com.mycompany.devtool.Feature#getInitialRelease <em>Initial Release</em>}</li>
 *   <li>{@link com.mycompany.devtool.Feature#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mycompany.devtool.Feature#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @see com.mycompany.devtool.DevtoolPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mycompany.devtool.DevtoolPackage#getFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mycompany.devtool.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Release</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Release</em>' reference.
	 * @see #setInitialRelease(Version)
	 * @see com.mycompany.devtool.DevtoolPackage#getFeature_InitialRelease()
	 * @model
	 * @generated
	 */
	Version getInitialRelease();

	/**
	 * Sets the value of the '{@link com.mycompany.devtool.Feature#getInitialRelease <em>Initial Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Release</em>' reference.
	 * @see #getInitialRelease()
	 * @generated
	 */
	void setInitialRelease(Version value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.mycompany.devtool.DevtoolPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.mycompany.devtool.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference list.
	 * The list contents are of type {@link com.mycompany.devtool.Update}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference list.
	 * @see com.mycompany.devtool.DevtoolPackage#getFeature_Updates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Update> getUpdates();

} // Feature
