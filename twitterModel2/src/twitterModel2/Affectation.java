/**
 */
package twitterModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.Affectation#getVariable <em>Variable</em>}</li>
 *   <li>{@link twitterModel2.Affectation#getOpDroite <em>Op Droite</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends ExpBinaire {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see twitterModel2.TwitterModel2Package#getAffectation_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link twitterModel2.Affectation#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Op Droite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Droite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Droite</em>' reference.
	 * @see #setOpDroite(Expression)
	 * @see twitterModel2.TwitterModel2Package#getAffectation_OpDroite()
	 * @model
	 * @generated
	 */
	Expression getOpDroite();

	/**
	 * Sets the value of the '{@link twitterModel2.Affectation#getOpDroite <em>Op Droite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Droite</em>' reference.
	 * @see #getOpDroite()
	 * @generated
	 */
	void setOpDroite(Expression value);

} // Affectation
