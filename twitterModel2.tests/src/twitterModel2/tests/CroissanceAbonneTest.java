/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.CroissanceAbonne;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Croissance Abonne</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CroissanceAbonneTest extends CommandStatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CroissanceAbonneTest.class);
	}

	/**
	 * Constructs a new Croissance Abonne test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CroissanceAbonneTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Croissance Abonne test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CroissanceAbonne getFixture() {
		return (CroissanceAbonne)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createCroissanceAbonne());
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

} //CroissanceAbonneTest
