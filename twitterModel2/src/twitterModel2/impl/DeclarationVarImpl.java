/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.DeclarationVar;
import twitterModel2.Expression;
import twitterModel2.TwitterModel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.impl.DeclarationVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link twitterModel2.impl.DeclarationVarImpl#getOpDroite <em>Op Droite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationVarImpl extends StatementImpl implements DeclarationVar {
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
	protected DeclarationVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.DECLARATION_VAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.DECLARATION_VAR__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.DECLARATION_VAR__OP_DROITE, oldOpDroite, newOpDroite);
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
				msgs = ((InternalEObject)opDroite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.DECLARATION_VAR__OP_DROITE, null, msgs);
			if (newOpDroite != null)
				msgs = ((InternalEObject)newOpDroite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.DECLARATION_VAR__OP_DROITE, null, msgs);
			msgs = basicSetOpDroite(newOpDroite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.DECLARATION_VAR__OP_DROITE, newOpDroite, newOpDroite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterModel2Package.DECLARATION_VAR__OP_DROITE:
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
			case TwitterModel2Package.DECLARATION_VAR__NAME:
				return getName();
			case TwitterModel2Package.DECLARATION_VAR__OP_DROITE:
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
			case TwitterModel2Package.DECLARATION_VAR__NAME:
				setName((String)newValue);
				return;
			case TwitterModel2Package.DECLARATION_VAR__OP_DROITE:
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
			case TwitterModel2Package.DECLARATION_VAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TwitterModel2Package.DECLARATION_VAR__OP_DROITE:
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
			case TwitterModel2Package.DECLARATION_VAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TwitterModel2Package.DECLARATION_VAR__OP_DROITE:
				return opDroite != null;
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
		result.append(')');
		return result.toString();
	}

} //DeclarationVarImpl
