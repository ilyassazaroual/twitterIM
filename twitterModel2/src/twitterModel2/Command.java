/**
 */
package twitterModel2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitterModel2.Command#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see twitterModel2.TwitterModel2Package#getCommand()
 * @model abstract="true"
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' reference list.
	 * The list contents are of type {@link twitterModel2.Args}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' reference list.
	 * @see twitterModel2.TwitterModel2Package#getCommand_Args()
	 * @model required="true"
	 * @generated
	 */
	EList<Args> getArgs();

} // Command
