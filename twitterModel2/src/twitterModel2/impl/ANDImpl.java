/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.AND;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AND</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ANDImpl extends OpBoolImpl implements AND {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ANDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.AND;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //ANDImpl
