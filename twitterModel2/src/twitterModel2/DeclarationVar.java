/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.DeclarationVar#getName <em>Name</em>}</li>
 *   <li>{@link twitterModel2.DeclarationVar#getOpDroite <em>Op Droite</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getDeclarationVar()
 * @model
 * @generated
 */
public interface DeclarationVar extends Statement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see twitterModel2.TwitterModel2Package#getDeclarationVar_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link twitterModel2.DeclarationVar#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Op Droite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Droite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Droite</em>' containment reference.
	 * @see #setOpDroite(Expression)
	 * @see twitterModel2.TwitterModel2Package#getDeclarationVar_OpDroite()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOpDroite();

	/**
	 * Sets the value of the '{@link twitterModel2.DeclarationVar#getOpDroite <em>Op Droite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Droite</em>' containment reference.
	 * @see #getOpDroite()
	 * @generated
	 */
	void setOpDroite(Expression value);

} // DeclarationVar
