/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.Block;
import twitterModel2.If;
import twitterModel2.OpBool;
import twitterModel2.TwitterModel2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.impl.IfImpl#getElseBlock <em>Else Block</em>}</li>
 *   <li>{@link twitterModel2.impl.IfImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link twitterModel2.impl.IfImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseBlock;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected Block ifBlock;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected OpBool condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseBlock(Block newElseBlock, NotificationChain msgs) {
		Block oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__ELSE_BLOCK, oldElseBlock, newElseBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(Block newElseBlock) {
		if (newElseBlock != elseBlock) {
			NotificationChain msgs = null;
			if (elseBlock != null)
				msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__ELSE_BLOCK, null, msgs);
			if (newElseBlock != null)
				msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__ELSE_BLOCK, null, msgs);
			msgs = basicSetElseBlock(newElseBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__ELSE_BLOCK, newElseBlock, newElseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getIfBlock() {
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfBlock(Block newIfBlock, NotificationChain msgs) {
		Block oldIfBlock = ifBlock;
		ifBlock = newIfBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__IF_BLOCK, oldIfBlock, newIfBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBlock(Block newIfBlock) {
		if (newIfBlock != ifBlock) {
			NotificationChain msgs = null;
			if (ifBlock != null)
				msgs = ((InternalEObject)ifBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__IF_BLOCK, null, msgs);
			if (newIfBlock != null)
				msgs = ((InternalEObject)newIfBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__IF_BLOCK, null, msgs);
			msgs = basicSetIfBlock(newIfBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__IF_BLOCK, newIfBlock, newIfBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpBool getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(OpBool newCondition, NotificationChain msgs) {
		OpBool oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(OpBool newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TwitterModel2Package.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterModel2Package.IF__ELSE_BLOCK:
				return basicSetElseBlock(null, msgs);
			case TwitterModel2Package.IF__IF_BLOCK:
				return basicSetIfBlock(null, msgs);
			case TwitterModel2Package.IF__CONDITION:
				return basicSetCondition(null, msgs);
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
			case TwitterModel2Package.IF__ELSE_BLOCK:
				return getElseBlock();
			case TwitterModel2Package.IF__IF_BLOCK:
				return getIfBlock();
			case TwitterModel2Package.IF__CONDITION:
				return getCondition();
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
			case TwitterModel2Package.IF__ELSE_BLOCK:
				setElseBlock((Block)newValue);
				return;
			case TwitterModel2Package.IF__IF_BLOCK:
				setIfBlock((Block)newValue);
				return;
			case TwitterModel2Package.IF__CONDITION:
				setCondition((OpBool)newValue);
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
			case TwitterModel2Package.IF__ELSE_BLOCK:
				setElseBlock((Block)null);
				return;
			case TwitterModel2Package.IF__IF_BLOCK:
				setIfBlock((Block)null);
				return;
			case TwitterModel2Package.IF__CONDITION:
				setCondition((OpBool)null);
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
			case TwitterModel2Package.IF__ELSE_BLOCK:
				return elseBlock != null;
			case TwitterModel2Package.IF__IF_BLOCK:
				return ifBlock != null;
			case TwitterModel2Package.IF__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
