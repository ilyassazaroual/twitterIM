/**
 */
package twitterModel2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.Variable#getNameVariable <em>Name Variable</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Variable</em>' attribute.
	 * @see #setNameVariable(String)
	 * @see twitterModel2.TwitterModel2Package#getVariable_NameVariable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNameVariable();

	/**
	 * Sets the value of the '{@link twitterModel2.Variable#getNameVariable <em>Name Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Variable</em>' attribute.
	 * @see #getNameVariable()
	 * @generated
	 */
	void setNameVariable(String value);

} // Variable
