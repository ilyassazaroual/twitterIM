/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.tweets_location;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>tweets location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class tweets_locationTest extends CommandTwitterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(tweets_locationTest.class);
	}

	/**
	 * Constructs a new tweets location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_locationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this tweets location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected tweets_location getFixture() {
		return (tweets_location)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createtweets_location());
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

} //tweets_locationTest
