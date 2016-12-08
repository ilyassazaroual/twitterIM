/**
 */
package twitterModel2.impl;

import org.eclipse.emf.ecore.EClass;

import twitterModel2.ProportionNegatif;
import twitterModel2.TwitterModel2Package;
import twitterModel2.Visiteur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proportion Negatif</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProportionNegatifImpl extends CommandStatImpl implements ProportionNegatif {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProportionNegatifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TwitterModel2Package.Literals.PROPORTION_NEGATIF;
	}

	@Override
	public String accepteVisiteur(Visiteur v) {
		return v.visite(this);
	}

} //ProportionNegatifImpl
