/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.EQUALS;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EQUALS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EQUALSImpl extends OpBoolImpl implements EQUALS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EQUALSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.EQUALS;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //EQUALSImpl
