/**
 */
package twitterModel2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import twitterModel2.Block;
import twitterModel2.ExpBool;
import twitterModel2.If;
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
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected Block elseBlock;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected Block ifBlock;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ExpBool condition;

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
		if (elseBlock != null && elseBlock.eIsProxy()) {
			InternalEObject oldElseBlock = (InternalEObject)elseBlock;
			elseBlock = (Block)eResolveProxy(oldElseBlock);
			if (elseBlock != oldElseBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.IF__ELSE_BLOCK, oldElseBlock, elseBlock));
			}
		}
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetElseBlock() {
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseBlock(Block newElseBlock) {
		Block oldElseBlock = elseBlock;
		elseBlock = newElseBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__ELSE_BLOCK, oldElseBlock, elseBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getIfBlock() {
		if (ifBlock != null && ifBlock.eIsProxy()) {
			InternalEObject oldIfBlock = (InternalEObject)ifBlock;
			ifBlock = (Block)eResolveProxy(oldIfBlock);
			if (ifBlock != oldIfBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.IF__IF_BLOCK, oldIfBlock, ifBlock));
			}
		}
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetIfBlock() {
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfBlock(Block newIfBlock) {
		Block oldIfBlock = ifBlock;
		ifBlock = newIfBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__IF_BLOCK, oldIfBlock, ifBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBool getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (ExpBool)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TwitterModel2Package.IF__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpBool basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ExpBool newCondition) {
		ExpBool oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterModel2Package.IF__CONDITION, oldCondition, condition));
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
				if (resolve) return getElseBlock();
				return basicGetElseBlock();
			case TwitterModel2Package.IF__IF_BLOCK:
				if (resolve) return getIfBlock();
				return basicGetIfBlock();
			case TwitterModel2Package.IF__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
				setCondition((ExpBool)newValue);
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
				setCondition((ExpBool)null);
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
