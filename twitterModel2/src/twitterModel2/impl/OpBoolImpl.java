/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.Expression;
import twitterModel2.OpBool;
import twitterModel2.TwitterModel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Bool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.impl.OpBoolImpl#getExpressionG <em>Expression G</em>}</li>
 *   <li>{@link twitterModel2.impl.OpBoolImpl#getExpressionD <em>Expression D</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OpBoolImpl extends ExpBinaireImpl implements OpBool {
	/**
	 * The cached value of the '{@link #getExpressionG() <em>Expression G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionG()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionG;

	/**
	 * The cached value of the '{@link #getExpressionD() <em>Expression D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionD()
	 * @generated
	 * @ordered
	 */
	protected Expression expressionD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpBoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.OP_BOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionG() {
		return expressionG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionG(Expression newExpressionG, NotificationChain msgs) {
		Expression oldExpressionG = expressionG;
		expressionG = newExpressionG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.OP_BOOL__EXPRESSION_G, oldExpressionG, newExpressionG);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionG(Expression newExpressionG) {
		if (newExpressionG != expressionG) {
			NotificationChain msgs = null;
			if (expressionG != null)
				msgs = ((InternalEObject)expressionG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.OP_BOOL__EXPRESSION_G, null, msgs);
			if (newExpressionG != null)
				msgs = ((InternalEObject)newExpressionG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.OP_BOOL__EXPRESSION_G, null, msgs);
			msgs = basicSetExpressionG(newExpressionG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.OP_BOOL__EXPRESSION_G, newExpressionG, newExpressionG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpressionD() {
		return expressionD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionD(Expression newExpressionD, NotificationChain msgs) {
		Expression oldExpressionD = expressionD;
		expressionD = newExpressionD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.OP_BOOL__EXPRESSION_D, oldExpressionD, newExpressionD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionD(Expression newExpressionD) {
		if (newExpressionD != expressionD) {
			NotificationChain msgs = null;
			if (expressionD != null)
				msgs = ((InternalEObject)expressionD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.OP_BOOL__EXPRESSION_D, null, msgs);
			if (newExpressionD != null)
				msgs = ((InternalEObject)newExpressionD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.OP_BOOL__EXPRESSION_D, null, msgs);
			msgs = basicSetExpressionD(newExpressionD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.OP_BOOL__EXPRESSION_D, newExpressionD, newExpressionD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterModel2Package.OP_BOOL__EXPRESSION_G:
				return basicSetExpressionG(null, msgs);
			case TwitterModel2Package.OP_BOOL__EXPRESSION_D:
				return basicSetExpressionD(null, msgs);
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
			case TwitterModel2Package.OP_BOOL__EXPRESSION_G:
				return getExpressionG();
			case TwitterModel2Package.OP_BOOL__EXPRESSION_D:
				return getExpressionD();
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
			case TwitterModel2Package.OP_BOOL__EXPRESSION_G:
				setExpressionG((Expression)newValue);
				return;
			case TwitterModel2Package.OP_BOOL__EXPRESSION_D:
				setExpressionD((Expression)newValue);
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
			case TwitterModel2Package.OP_BOOL__EXPRESSION_G:
				setExpressionG((Expression)null);
				return;
			case TwitterModel2Package.OP_BOOL__EXPRESSION_D:
				setExpressionD((Expression)null);
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
			case TwitterModel2Package.OP_BOOL__EXPRESSION_G:
				return expressionG != null;
			case TwitterModel2Package.OP_BOOL__EXPRESSION_D:
				return expressionD != null;
		}
		return super.eIsSet(featureID);
	}

} //OpBoolImpl
