/**
 */
package twitterModel2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.Program#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link twitterModel2.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see twitterModel2.TwitterModel2Package#getProgram_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // Program
