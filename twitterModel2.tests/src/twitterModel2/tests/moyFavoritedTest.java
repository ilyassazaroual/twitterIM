/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.moyFavorited;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>moy Favorited</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class moyFavoritedTest extends CommandStatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(moyFavoritedTest.class);
	}

	/**
	 * Constructs a new moy Favorited test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moyFavoritedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this moy Favorited test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected moyFavorited getFixture() {
		return (moyFavorited)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createmoyFavorited());
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

} //moyFavoritedTest
