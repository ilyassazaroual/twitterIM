/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.LESS;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LESS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LESSImpl extends OpBoolImpl implements LESS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LESSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.LESS;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //LESSImpl
