/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Bool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.OpBool#getExpressionG <em>Expression G</em>}</li>
 *   <li>{@link twitterModel2.OpBool#getExpressionD <em>Expression D</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getOpBool()
 * @model abstract="true"
 * @generated
 */
public interface OpBool extends ExpBinaire {
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
	 * @see twitterModel2.TwitterModel2Package#getOpBool_ExpressionG()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressionG();

	/**
	 * Sets the value of the '{@link twitterModel2.OpBool#getExpressionG <em>Expression G</em>}' containment reference.
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
	 * @see twitterModel2.TwitterModel2Package#getOpBool_ExpressionD()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpressionD();

	/**
	 * Sets the value of the '{@link twitterModel2.OpBool#getExpressionD <em>Expression D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression D</em>' containment reference.
	 * @see #getExpressionD()
	 * @generated
	 */
	void setExpressionD(Expression value);

} // OpBool
