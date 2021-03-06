/*
 * generated by Xtext 2.10.0
 */
package esir3.im.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import twitterModel2.Program

@RunWith(XtextRunner)
@InjectWith(TwInjectorProvider)
class TwParsingTest{

	@Inject
	ParseHelper<Program> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
