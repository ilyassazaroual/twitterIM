/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.MUL;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MUL</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MULImpl extends ExpBinaireImpl implements MUL {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MULImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.MUL;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //MULImpl
