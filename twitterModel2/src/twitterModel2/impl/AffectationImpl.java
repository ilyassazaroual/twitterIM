/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getOpDroite() <em>Op Droite</em>}' containment reference.
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
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.AFFECTATION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.AFFECTATION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOpDroite() {
		return opDroite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpDroite(Expression newOpDroite, NotificationChain msgs) {
		Expression oldOpDroite = opDroite;
		opDroite = newOpDroite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__OP_DROITE, oldOpDroite, newOpDroite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpDroite(Expression newOpDroite) {
		if (newOpDroite != opDroite) {
			NotificationChain msgs = null;
			if (opDroite != null)
				msgs = ((InternalEObject)opDroite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.AFFECTATION__OP_DROITE, null, msgs);
			if (newOpDroite != null)
				msgs = ((InternalEObject)newOpDroite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.AFFECTATION__OP_DROITE, null, msgs);
			msgs = basicSetOpDroite(newOpDroite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.AFFECTATION__OP_DROITE, newOpDroite, newOpDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				return basicSetVariable(null, msgs);
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				return basicSetOpDroite(null, msgs);
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
			case TwitterModel2Package.AFFECTATION__VARIABLE:
				return getVariable();
			case TwitterModel2Package.AFFECTATION__OP_DROITE:
				return getOpDroite();
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
