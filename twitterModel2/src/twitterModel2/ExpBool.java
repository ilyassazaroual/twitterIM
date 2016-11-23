/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.ExpBool#getOpBool <em>Op Bool</em>}</li>
 *   <li>{@link twitterModel2.ExpBool#getExpressionG <em>Expression G</em>}</li>
 *   <li>{@link twitterModel2.ExpBool#getExpressionD <em>Expression D</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getExpBool()
 * @model
 * @generated
 */
public interface ExpBool extends ExpBinaire {
	/**
	 * Returns the value of the '<em><b>Op Bool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Bool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Bool</em>' reference.
	 * @see #setOpBool(opBool)
	 * @see twitterModel2.TwitterModel2Package#getExpBool_OpBool()
	 * @model required="true"
	 * @generated
	 */
	opBool getOpBool();

	/**
	 * Sets the value of the '{@link twitterModel2.ExpBool#getOpBool <em>Op Bool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Bool</em>' reference.
	 * @see #getOpBool()
	 * @generated
	 */
	void setOpBool(opBool value);

	/**
	 * Returns the value of the '<em><b>Expression G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression G</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression G</em>' containment reference.
	 * @see #setExpressionG(Expression)
	 * @see twitterModel2.TwitterModel2Package#getExpBool_ExpressionG()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressionG();

	/**
	 * Sets the value of the '{@link twitterModel2.ExpBool#getExpressionG <em>Expression G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression G</em>' containment reference.
	 * @see #getExpressionG()
	 * @generated
	 */
	void setExpressionG(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression D</em>' containment reference.
	 * @see #setExpressionD(Expression)
	 * @see twitterModel2.TwitterModel2Package#getExpBool_ExpressionD()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressionD();

	/**
	 * Sets the value of the '{@link twitterModel2.ExpBool#getExpressionD <em>Expression D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression D</em>' containment reference.
	 * @see #getExpressionD()
	 * @generated
	 */
	void setExpressionD(Expression value);

} // ExpBool
