/**
 */
package twitterModel2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see twitterModel2.TwitterModel2Package
 * @generated
 */
public interface TwitterModel2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TwitterModel2Factory eINSTANCE = twitterModel2.impl.TwitterModel2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>Args</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Args</em>'.
	 * @generated
	 */
	Args createArgs();

	/**
	 * Returns a new object of class '<em>Declaration Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration Var</em>'.
	 * @generated
	 */
	DeclarationVar createDeclarationVar();

	/**
	 * Returns a new object of class '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND</em>'.
	 * @generated
	 */
	AND createAND();

	/**
	 * Returns a new object of class '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR</em>'.
	 * @generated
	 */
	OR createOR();

	/**
	 * Returns a new object of class '<em>tweets user</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tweets user</em>'.
	 * @generated
	 */
	tweets_user createtweets_user();

	/**
	 * Returns a new object of class '<em>tweets location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tweets location</em>'.
	 * @generated
	 */
	tweets_location createtweets_location();

	/**
	 * Returns a new object of class '<em>tweets entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tweets entity</em>'.
	 * @generated
	 */
	tweets_entity createtweets_entity();

	/**
	 * Returns a new object of class '<em>tweets date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tweets date</em>'.
	 * @generated
	 */
	tweets_date createtweets_date();

	/**
	 * Returns a new object of class '<em>Proportion Positif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proportion Positif</em>'.
	 * @generated
	 */
	ProportionPositif createProportionPositif();

	/**
	 * Returns a new object of class '<em>Proportion Negatif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proportion Negatif</em>'.
	 * @generated
	 */
	ProportionNegatif createProportionNegatif();

	/**
	 * Returns a new object of class '<em>count Tweet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>count Tweet</em>'.
	 * @generated
	 */
	countTweet createcountTweet();

	/**
	 * Returns a new object of class '<em>count Visit Profil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>count Visit Profil</em>'.
	 * @generated
	 */
	countVisitProfil createcountVisitProfil();

	/**
	 * Returns a new object of class '<em>Croissance Abonne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Croissance Abonne</em>'.
	 * @generated
	 */
	CroissanceAbonne createCroissanceAbonne();

	/**
	 * Returns a new object of class '<em>moy Followers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>moy Followers</em>'.
	 * @generated
	 */
	moyFollowers createmoyFollowers();

	/**
	 * Returns a new object of class '<em>moy Favorited</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>moy Favorited</em>'.
	 * @generated
	 */
	moyFavorited createmoyFavorited();

	/**
	 * Returns a new object of class '<em>GREATER</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GREATER</em>'.
	 * @generated
	 */
	GREATER createGREATER();

	/**
	 * Returns a new object of class '<em>LESS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LESS</em>'.
	 * @generated
	 */
	LESS createLESS();

	/**
	 * Returns a new object of class '<em>EQUALS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EQUALS</em>'.
	 * @generated
	 */
	EQUALS createEQUALS();

	/**
	 * Returns a new object of class '<em>Utilisation Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilisation Var</em>'.
	 * @generated
	 */
	UtilisationVar createUtilisationVar();

	/**
	 * Returns a new object of class '<em>print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>print</em>'.
	 * @generated
	 */
	print createprint();

	/**
	 * Returns a new object of class '<em>String Tw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Tw</em>'.
	 * @generated
	 */
	StringTw createStringTw();

	/**
	 * Returns a new object of class '<em>ADD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADD</em>'.
	 * @generated
	 */
	ADD createADD();

	/**
	 * Returns a new object of class '<em>MUL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MUL</em>'.
	 * @generated
	 */
	MUL createMUL();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TwitterModel2Package getTwitterModel2Package();

} //TwitterModel2Factory
