/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisation Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.UtilisationVar#getNameVar <em>Name Var</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getUtilisationVar()
 * @model
 * @generated
 */
public interface UtilisationVar extends Expression {
	/**
	 * Returns the value of the '<em><b>Name Var</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Var</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Var</em>' reference.
	 * @see #setNameVar(DeclarationVar)
	 * @see twitterModel2.TwitterModel2Package#getUtilisationVar_NameVar()
	 * @model required="true"
	 * @generated
	 */
	DeclarationVar getNameVar();

	/**
	 * Sets the value of the '{@link twitterModel2.UtilisationVar#getNameVar <em>Name Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Var</em>' reference.
	 * @see #getNameVar()
	 * @generated
	 */
	void setNameVar(DeclarationVar value);

} // UtilisationVar
