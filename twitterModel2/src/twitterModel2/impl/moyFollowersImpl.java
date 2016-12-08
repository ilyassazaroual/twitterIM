/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;
import twitterModel2.moyFollowers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>moy Followers</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class moyFollowersImpl extends CommandStatImpl implements moyFollowers {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected moyFollowersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.MOY_FOLLOWERS;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //moyFollowersImpl
