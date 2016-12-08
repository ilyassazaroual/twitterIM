/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;
import twitterModel2.tweets_entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tweets entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class tweets_entityImpl extends CommandTwitterImpl implements tweets_entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tweets_entityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.TWEETS_ENTITY;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //tweets_entityImpl
