/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.Affectation;
import twitterModel2.Expression;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.impl.AffectationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link twitterModel2.impl.AffectationImpl#getOpDroite <em>Op Droite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectationImpl extends ExpBinaireImpl implements Affectation {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getOpDroite() <em>Op Droite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpDroite()
	 * @generated
	 * @ordered
	 */
	protected Expression opDroite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.AFFECTATION__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOpDroite() {
		if (opDroite != null && opDroite.eIsProxy()) {
			InternalEObject oldOpDroite = (InternalEObject)opDroite;
			opDroite = (Expression)eResolveProxy(oldOpDroite);
			if (opDroite != oldOpDroite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.AFFECTATION__OP_DROITE, oldOpDroite, opDroite));
			}
		}
		return opDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetOpDroite() {
		return opDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDroite(Expression newOpDroite) {
		Expression oldOpDroite = opDroite;
		opDroite = newOpDroite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__OP_DROITE, oldOpDroite, opDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				if (resolve) return getOpDroite();
				return basicGetOpDroite();
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
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				setOpDroite((Expression)newValue);
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
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				setVariable((Variable)null);
				return;
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				setOpDroite((Expression)null);
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
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				return variable != null;
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				return opDroite != null;
		}
		return super.eIsSet(featureID);
	}

} //AffectationImpl
