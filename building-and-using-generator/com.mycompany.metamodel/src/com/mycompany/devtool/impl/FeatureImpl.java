/**
 */
package com.mycompany.devtool.impl;

import com.mycompany.devtool.DevtoolPackage;
import com.mycompany.devtool.Feature;
import com.mycompany.devtool.Update;
import com.mycompany.devtool.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mycompany.devtool.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mycompany.devtool.impl.FeatureImpl#getInitialRelease <em>Initial Release</em>}</li>
 *   <li>{@link com.mycompany.devtool.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mycompany.devtool.impl.FeatureImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialRelease() <em>Initial Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRelease()
	 * @generated
	 * @ordered
	 */
	protected Version initialRelease;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected EList<Update> updates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevtoolPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getInitialRelease() {
		if (initialRelease != null && initialRelease.eIsProxy()) {
			InternalEObject oldInitialRelease = (InternalEObject)initialRelease;
			initialRelease = (Version)eResolveProxy(oldInitialRelease);
			if (initialRelease != oldInitialRelease) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevtoolPackage.FEATURE__INITIAL_RELEASE, oldInitialRelease, initialRelease));
			}
		}
		return initialRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetInitialRelease() {
		return initialRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRelease(Version newInitialRelease) {
		Version oldInitialRelease = initialRelease;
		initialRelease = newInitialRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.FEATURE__INITIAL_RELEASE, oldInitialRelease, initialRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevtoolPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Update> getUpdates() {
		if (updates == null) {
			updates = new EObjectContainmentEList<Update>(Update.class, this, DevtoolPackage.FEATURE__UPDATES);
		}
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevtoolPackage.FEATURE__UPDATES:
				return ((InternalEList<?>)getUpdates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevtoolPackage.FEATURE__NAME:
				return getName();
			case DevtoolPackage.FEATURE__INITIAL_RELEASE:
				if (resolve) return getInitialRelease();
				return basicGetInitialRelease();
			case DevtoolPackage.FEATURE__DESCRIPTION:
				return getDescription();
			case DevtoolPackage.FEATURE__UPDATES:
				return getUpdates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevtoolPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case DevtoolPackage.FEATURE__INITIAL_RELEASE:
				setInitialRelease((Version)newValue);
				return;
			case DevtoolPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DevtoolPackage.FEATURE__UPDATES:
				getUpdates().clear();
				getUpdates().addAll((Collection<? extends Update>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevtoolPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DevtoolPackage.FEATURE__INITIAL_RELEASE:
				setInitialRelease((Version)null);
				return;
			case DevtoolPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DevtoolPackage.FEATURE__UPDATES:
				getUpdates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevtoolPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DevtoolPackage.FEATURE__INITIAL_RELEASE:
				return initialRelease != null;
			case DevtoolPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DevtoolPackage.FEATURE__UPDATES:
				return updates != null && !updates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
