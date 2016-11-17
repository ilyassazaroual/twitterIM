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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import twitter.Entity;
import twitter.Place;
import twitter.Tweet;
import twitter.TwitterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tweet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link twitter.impl.TweetImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getText <em>Text</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getRetweetCount <em>Retweet Count</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link twitter.impl.TweetImpl#getLikeCount <em>Like Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TweetImpl extends MinimalEObjectImpl.Container implements Tweet {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected String createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetweetCount() <em>Retweet Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetweetCount()
	 * @generated
	 * @ordered
	 */
	protected static final int RETWEET_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetweetCount() <em>Retweet Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetweetCount()
	 * @generated
	 * @ordered
	 */
	protected int retweetCount = RETWEET_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLikeCount() <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikeCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LIKE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLikeCount() <em>Like Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikeCount()
	 * @generated
	 * @ordered
	 */
	protected int likeCount = LIKE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TweetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterPackage.Literals.TWEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectResolvingEList<Entity>(Entity.class, this, TwitterPackage.TWEET__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectWithInverseResolvingEList<Place>(Place.class, this, TwitterPackage.TWEET__PLACE, TwitterPackage.PLACE__TWEET);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(String newCreatedAt) {
		String oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__CREATED_AT, oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetweetCount() {
		return retweetCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetweetCount(int newRetweetCount) {
		int oldRetweetCount = retweetCount;
		retweetCount = newRetweetCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__RETWEET_COUNT, oldRetweetCount, retweetCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLikeCount() {
		return likeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikeCount(int newLikeCount) {
		int oldLikeCount = likeCount;
		likeCount = newLikeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TwitterPackage.TWEET__LIKE_COUNT, oldLikeCount, likeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterPackage.TWEET__PLACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlace()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TwitterPackage.TWEET__PLACE:
				return ((InternalEList<?>)getPlace()).basicRemove(otherEnd, msgs);
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
			case TwitterPackage.TWEET__ENTITY:
				return getEntity();
			case TwitterPackage.TWEET__PLACE:
				return getPlace();
			case TwitterPackage.TWEET__CREATED_AT:
				return getCreatedAt();
			case TwitterPackage.TWEET__TEXT:
				return getText();
			case TwitterPackage.TWEET__RETWEET_COUNT:
				return getRetweetCount();
			case TwitterPackage.TWEET__LANG:
				return getLang();
			case TwitterPackage.TWEET__LIKE_COUNT:
				return getLikeCount();
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
			case TwitterPackage.TWEET__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case TwitterPackage.TWEET__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case TwitterPackage.TWEET__CREATED_AT:
				setCreatedAt((String)newValue);
				return;
			case TwitterPackage.TWEET__TEXT:
				setText((String)newValue);
				return;
			case TwitterPackage.TWEET__RETWEET_COUNT:
				setRetweetCount((Integer)newValue);
				return;
			case TwitterPackage.TWEET__LANG:
				setLang((String)newValue);
				return;
			case TwitterPackage.TWEET__LIKE_COUNT:
				setLikeCount((Integer)newValue);
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
			case TwitterPackage.TWEET__ENTITY:
				getEntity().clear();
				return;
			case TwitterPackage.TWEET__PLACE:
				getPlace().clear();
				return;
			case TwitterPackage.TWEET__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case TwitterPackage.TWEET__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TwitterPackage.TWEET__RETWEET_COUNT:
				setRetweetCount(RETWEET_COUNT_EDEFAULT);
				return;
			case TwitterPackage.TWEET__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case TwitterPackage.TWEET__LIKE_COUNT:
				setLikeCount(LIKE_COUNT_EDEFAULT);
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
			case TwitterPackage.TWEET__ENTITY:
				return entity != null && !entity.isEmpty();
			case TwitterPackage.TWEET__PLACE:
				return place != null && !place.isEmpty();
			case TwitterPackage.TWEET__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
			case TwitterPackage.TWEET__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TwitterPackage.TWEET__RETWEET_COUNT:
				return retweetCount != RETWEET_COUNT_EDEFAULT;
			case TwitterPackage.TWEET__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case TwitterPackage.TWEET__LIKE_COUNT:
				return likeCount != LIKE_COUNT_EDEFAULT;
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
		result.append(" (createdAt: ");
		result.append(createdAt);
		result.append(", text: ");
		result.append(text);
		result.append(", retweetCount: ");
		result.append(retweetCount);
		result.append(", lang: ");
		result.append(lang);
		result.append(", likeCount: ");
		result.append(likeCount);
		result.append(')');
		return result.toString();
	}

} //TweetImpl
