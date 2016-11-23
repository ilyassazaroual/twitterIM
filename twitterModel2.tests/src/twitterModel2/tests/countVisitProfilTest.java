/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.countVisitProfil;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>count Visit Profil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class countVisitProfilTest extends CommandStatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(countVisitProfilTest.class);
	}

	/**
	 * Constructs a new count Visit Profil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public countVisitProfilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this count Visit Profil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected countVisitProfil getFixture() {
		return (countVisitProfil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createcountVisitProfil());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //countVisitProfilTest
