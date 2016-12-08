/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;
import twitterModel2.tweets_location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tweets location</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class tweets_locationImpl extends CommandTwitterImpl implements tweets_location {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_locationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.TWEETS_LOCATION;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //tweets_locationImpl
