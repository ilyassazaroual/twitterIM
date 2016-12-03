/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.DeclarationVar;
import twitterModel2.TwitterModel2Package;
import twitterModel2.UtilisationVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilisation Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.impl.UtilisationVarImpl#getNameVar <em>Name Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisationVarImpl extends ExpressionImpl implements UtilisationVar {
	/**
	 * The cached value of the '{@link #getNameVar() <em>Name Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameVar()
	 * @generated
	 * @ordered
	 */
	protected DeclarationVar nameVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisationVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.UTILISATION_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationVar getNameVar() {
		if (nameVar != null && nameVar.eIsProxy()) {
			InternalEObject oldNameVar = (InternalEObject)nameVar;
			nameVar = (DeclarationVar)eResolveProxy(oldNameVar);
			if (nameVar != oldNameVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.UTILISATION_VAR__NAME_VAR, oldNameVar, nameVar));
			}
		}
		return nameVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationVar basicGetNameVar() {
		return nameVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameVar(DeclarationVar newNameVar) {
		DeclarationVar oldNameVar = nameVar;
		nameVar = newNameVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.UTILISATION_VAR__NAME_VAR, oldNameVar, nameVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterModel2Package.UTILISATION_VAR__NAME_VAR:
				if (resolve) return getNameVar();
				return basicGetNameVar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterModel2Package.UTILISATION_VAR__NAME_VAR:
				setNameVar((DeclarationVar)newValue);
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
			case TwitterModel2Package.UTILISATION_VAR__NAME_VAR:
				setNameVar((DeclarationVar)null);
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
			case TwitterModel2Package.UTILISATION_VAR__NAME_VAR:
				return nameVar != null;
		}
		return super.eIsSet(featureID);
	}

} //UtilisationVarImpl
