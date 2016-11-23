/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.moyFollowers;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>moy Followers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class moyFollowersTest extends CommandStatTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(moyFollowersTest.class);
	}

	/**
	 * Constructs a new moy Followers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public moyFollowersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this moy Followers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected moyFollowers getFixture() {
		return (moyFollowers)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createmoyFollowers());
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

} //moyFollowersTest
