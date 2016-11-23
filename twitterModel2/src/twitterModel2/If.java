/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.If#getElseBlock <em>Else Block</em>}</li>
 *   <li>{@link twitterModel2.If#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link twitterModel2.If#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getIf()
 * @model
 * @generated
 */
public interface If extends Statement {
	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' reference.
	 * @see #setElseBlock(Block)
	 * @see twitterModel2.TwitterModel2Package#getIf_ElseBlock()
	 * @model
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getElseBlock <em>Else Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' reference.
	 * @see #setIfBlock(Block)
	 * @see twitterModel2.TwitterModel2Package#getIf_IfBlock()
	 * @model required="true"
	 * @generated
	 */
	Block getIfBlock();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getIfBlock <em>If Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ExpBool)
	 * @see twitterModel2.TwitterModel2Package#getIf_Condition()
	 * @model required="true"
	 * @generated
	 */
	ExpBool getCondition();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ExpBool value);

} // If
