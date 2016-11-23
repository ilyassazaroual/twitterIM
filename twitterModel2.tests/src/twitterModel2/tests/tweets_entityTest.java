/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.TwitterModel2Factory;
import twitterModel2.tweets_entity;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>tweets entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class tweets_entityTest extends CommandTwitterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(tweets_entityTest.class);
	}

	/**
	 * Constructs a new tweets entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tweets_entityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this tweets entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected tweets_entity getFixture() {
		return (tweets_entity)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createtweets_entity());
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

} //tweets_entityTest
