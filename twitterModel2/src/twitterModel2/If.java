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
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(Block)
	 * @see twitterModel2.TwitterModel2Package#getIf_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	Block getElseBlock();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(Block value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference.
	 * @see #setIfBlock(Block)
	 * @see twitterModel2.TwitterModel2Package#getIf_IfBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Block getIfBlock();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getIfBlock <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' containment reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(Block value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OpBool)
	 * @see twitterModel2.TwitterModel2Package#getIf_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OpBool getCondition();

	/**
	 * Sets the value of the '{@link twitterModel2.If#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OpBool value);

} // If
