/**
 */
package twitterModel2.tests;

import junit.textui.TestRunner;

import twitterModel2.StringTw;
import twitterModel2.TwitterModel2Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Tw</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringTwTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringTwTest.class);
	}

	/**
	 * Constructs a new String Tw test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringTwTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Tw test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringTw getFixture() {
		return (StringTw)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TwitterModel2Factory.eINSTANCE.createStringTw());
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

} //StringTwTest
