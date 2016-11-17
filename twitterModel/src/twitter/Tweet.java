/**
 */
package twitter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitter.Tweet#getEntity <em>Entity</em>}</li>
 *   <li>{@link twitter.Tweet#getPlace <em>Place</em>}</li>
 *   <li>{@link twitter.Tweet#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link twitter.Tweet#getText <em>Text</em>}</li>
 *   <li>{@link twitter.Tweet#getRetweetCount <em>Retweet Count</em>}</li>
 *   <li>{@link twitter.Tweet#getLang <em>Lang</em>}</li>
 *   <li>{@link twitter.Tweet#getLikeCount <em>Like Count</em>}</li>
 * </ul>
 *
 * @see twitter.TwitterPackage#getTweet()
 * @model
 * @generated
 */
public interface Tweet extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link twitter.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see twitter.TwitterPackage#getTweet_Entity()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference list.
	 * The list contents are of type {@link twitter.Place}.
	 * It is bidirectional and its opposite is '{@link twitter.Place#getTweet <em>Tweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference list.
	 * @see twitter.TwitterPackage#getTweet_Place()
	 * @see twitter.Place#getTweet
	 * @model opposite="tweet"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(String)
	 * @see twitter.TwitterPackage#getTweet_CreatedAt()
	 * @model
	 * @generated
	 */
	String getCreatedAt();

	/**
	 * Sets the value of the '{@link twitter.Tweet#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see twitter.TwitterPackage#getTweet_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link twitter.Tweet#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Retweet Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retweet Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retweet Count</em>' attribute.
	 * @see #setRetweetCount(int)
	 * @see twitter.TwitterPackage#getTweet_RetweetCount()
	 * @model
	 * @generated
	 */
	int getRetweetCount();

	/**
	 * Sets the value of the '{@link twitter.Tweet#getRetweetCount <em>Retweet Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retweet Count</em>' attribute.
	 * @see #getRetweetCount()
	 * @generated
	 */
	void setRetweetCount(int value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see twitter.TwitterPackage#getTweet_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link twitter.Tweet#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Like Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Like Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like Count</em>' attribute.
	 * @see #setLikeCount(int)
	 * @see twitter.TwitterPackage#getTweet_LikeCount()
	 * @model
	 * @generated
	 */
	int getLikeCount();

	/**
	 * Sets the value of the '{@link twitter.Tweet#getLikeCount <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Like Count</em>' attribute.
	 * @see #getLikeCount()
	 * @generated
	 */
	void setLikeCount(int value);

} // Tweet
