/**
 */
package twitter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link twitter.User#getFollowers <em>Followers</em>}</li>
 *   <li>{@link twitter.User#getFollowing <em>Following</em>}</li>
 *   <li>{@link twitter.User#getTweet <em>Tweet</em>}</li>
 *   <li>{@link twitter.User#getName <em>Name</em>}</li>
 *   <li>{@link twitter.User#getFavoriteCount <em>Favorite Count</em>}</li>
 *   <li>{@link twitter.User#getId <em>Id</em>}</li>
 *   <li>{@link twitter.User#getListCount <em>List Count</em>}</li>
 *   <li>{@link twitter.User#getLocation <em>Location</em>}</li>
 *   <li>{@link twitter.User#getProtected <em>Protected</em>}</li>
 * </ul>
 *
 * @see twitter.TwitterPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Followers</b></em>' reference list.
	 * The list contents are of type {@link twitter.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Followers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers</em>' reference list.
	 * @see twitter.TwitterPackage#getUser_Followers()
	 * @model
	 * @generated
	 */
	EList<User> getFollowers();

	/**
	 * Returns the value of the '<em><b>Following</b></em>' reference list.
	 * The list contents are of type {@link twitter.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Following</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following</em>' reference list.
	 * @see twitter.TwitterPackage#getUser_Following()
	 * @model
	 * @generated
	 */
	EList<User> getFollowing();

	/**
	 * Returns the value of the '<em><b>Tweet</b></em>' containment reference list.
	 * The list contents are of type {@link twitter.Tweet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tweet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tweet</em>' containment reference list.
	 * @see twitter.TwitterPackage#getUser_Tweet()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tweet> getTweet();

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
	 * @see twitter.TwitterPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link twitter.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Favorite Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favorite Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Favorite Count</em>' attribute.
	 * @see #setFavoriteCount(int)
	 * @see twitter.TwitterPackage#getUser_FavoriteCount()
	 * @model
	 * @generated
	 */
	int getFavoriteCount();

	/**
	 * Sets the value of the '{@link twitter.User#getFavoriteCount <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Favorite Count</em>' attribute.
	 * @see #getFavoriteCount()
	 * @generated
	 */
	void setFavoriteCount(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see twitter.TwitterPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link twitter.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>List Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Count</em>' attribute.
	 * @see #setListCount(int)
	 * @see twitter.TwitterPackage#getUser_ListCount()
	 * @model
	 * @generated
	 */
	int getListCount();

	/**
	 * Sets the value of the '{@link twitter.User#getListCount <em>List Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Count</em>' attribute.
	 * @see #getListCount()
	 * @generated
	 */
	void setListCount(int value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see twitter.TwitterPackage#getUser_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link twitter.User#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protected</em>' attribute.
	 * @see #setProtected(Boolean)
	 * @see twitter.TwitterPackage#getUser_Protected()
	 * @model
	 * @generated
	 */
	Boolean getProtected();

	/**
	 * Sets the value of the '{@link twitter.User#getProtected <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected</em>' attribute.
	 * @see #getProtected()
	 * @generated
	 */
	void setProtected(Boolean value);

} // User
