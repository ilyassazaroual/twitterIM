/**
 */
package twitter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import twitter.Tweet;
import twitter.TwitterPackage;
import twitter.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitter.impl.UserImpl#getFollowers <em>Followers</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getFollowing <em>Following</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getTweet <em>Tweet</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getFavoriteCount <em>Favorite Count</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getListCount <em>List Count</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link twitter.impl.UserImpl#getProtected <em>Protected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The cached value of the '{@link #getFollowers() <em>Followers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> followers;

	/**
	 * The cached value of the '{@link #getFollowing() <em>Following</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing()
	 * @generated
	 * @ordered
	 */
	protected EList<User> following;

	/**
	 * The cached value of the '{@link #getTweet() <em>Tweet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTweet()
	 * @generated
	 * @ordered
	 */
	protected EList<Tweet> tweet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFavoriteCount() <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavoriteCount()
	 * @generated
	 * @ordered
	 */
	protected static final int FAVORITE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFavoriteCount() <em>Favorite Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavoriteCount()
	 * @generated
	 * @ordered
	 */
	protected int favoriteCount = FAVORITE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getListCount() <em>List Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LIST_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getListCount() <em>List Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListCount()
	 * @generated
	 * @ordered
	 */
	protected int listCount = LIST_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROTECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtected() <em>Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtected()
	 * @generated
	 * @ordered
	 */
	protected Boolean protected_ = PROTECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getFollowers() {
		if (followers == null) {
			followers = new EObjectResolvingEList<User>(User.class, this, TwitterPackage.USER__FOLLOWERS);
		}
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getFollowing() {
		if (following == null) {
			following = new EObjectResolvingEList<User>(User.class, this, TwitterPackage.USER__FOLLOWING);
		}
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tweet> getTweet() {
		if (tweet == null) {
			tweet = new EObjectContainmentEList<Tweet>(Tweet.class, this, TwitterPackage.USER__TWEET);
		}
		return tweet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFavoriteCount() {
		return favoriteCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFavoriteCount(int newFavoriteCount) {
		int oldFavoriteCount = favoriteCount;
		favoriteCount = newFavoriteCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__FAVORITE_COUNT, oldFavoriteCount, favoriteCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getListCount() {
		return listCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListCount(int newListCount) {
		int oldListCount = listCount;
		listCount = newListCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__LIST_COUNT, oldListCount, listCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getProtected() {
		return protected_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtected(Boolean newProtected) {
		Boolean oldProtected = protected_;
		protected_ = newProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.USER__PROTECTED, oldProtected, protected_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterPackage.USER__TWEET:
				return ((InternalEList<?>)getTweet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TwitterPackage.USER__FOLLOWERS:
				return getFollowers();
			case TwitterPackage.USER__FOLLOWING:
				return getFollowing();
			case TwitterPackage.USER__TWEET:
				return getTweet();
			case TwitterPackage.USER__NAME:
				return getName();
			case TwitterPackage.USER__FAVORITE_COUNT:
				return getFavoriteCount();
			case TwitterPackage.USER__ID:
				return getId();
			case TwitterPackage.USER__LIST_COUNT:
				return getListCount();
			case TwitterPackage.USER__LOCATION:
				return getLocation();
			case TwitterPackage.USER__PROTECTED:
				return getProtected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TwitterPackage.USER__FOLLOWERS:
				getFollowers().clear();
				getFollowers().addAll((Collection<? extends User>)newValue);
				return;
			case TwitterPackage.USER__FOLLOWING:
				getFollowing().clear();
				getFollowing().addAll((Collection<? extends User>)newValue);
				return;
			case TwitterPackage.USER__TWEET:
				getTweet().clear();
				getTweet().addAll((Collection<? extends Tweet>)newValue);
				return;
			case TwitterPackage.USER__NAME:
				setName((String)newValue);
				return;
			case TwitterPackage.USER__FAVORITE_COUNT:
				setFavoriteCount((Integer)newValue);
				return;
			case TwitterPackage.USER__ID:
				setId((Integer)newValue);
				return;
			case TwitterPackage.USER__LIST_COUNT:
				setListCount((Integer)newValue);
				return;
			case TwitterPackage.USER__LOCATION:
				setLocation((String)newValue);
				return;
			case TwitterPackage.USER__PROTECTED:
				setProtected((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TwitterPackage.USER__FOLLOWERS:
				getFollowers().clear();
				return;
			case TwitterPackage.USER__FOLLOWING:
				getFollowing().clear();
				return;
			case TwitterPackage.USER__TWEET:
				getTweet().clear();
				return;
			case TwitterPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TwitterPackage.USER__FAVORITE_COUNT:
				setFavoriteCount(FAVORITE_COUNT_EDEFAULT);
				return;
			case TwitterPackage.USER__ID:
				setId(ID_EDEFAULT);
				return;
			case TwitterPackage.USER__LIST_COUNT:
				setListCount(LIST_COUNT_EDEFAULT);
				return;
			case TwitterPackage.USER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case TwitterPackage.USER__PROTECTED:
				setProtected(PROTECTED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TwitterPackage.USER__FOLLOWERS:
				return followers != null && !followers.isEmpty();
			case TwitterPackage.USER__FOLLOWING:
				return following != null && !following.isEmpty();
			case TwitterPackage.USER__TWEET:
				return tweet != null && !tweet.isEmpty();
			case TwitterPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TwitterPackage.USER__FAVORITE_COUNT:
				return favoriteCount != FAVORITE_COUNT_EDEFAULT;
			case TwitterPackage.USER__ID:
				return id != ID_EDEFAULT;
			case TwitterPackage.USER__LIST_COUNT:
				return listCount != LIST_COUNT_EDEFAULT;
			case TwitterPackage.USER__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case TwitterPackage.USER__PROTECTED:
				return PROTECTED_EDEFAULT == null ? protected_ != null : !PROTECTED_EDEFAULT.equals(protected_);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", favoriteCount: ");
		result.append(favoriteCount);
		result.append(", id: ");
		result.append(id);
		result.append(", listCount: ");
		result.append(listCount);
		result.append(", location: ");
		result.append(location);
		result.append(", protected: ");
		result.append(protected_);
		result.append(')');
		return result.toString();
	}

} //UserImpl
