/*
 * generated by Xtext 2.10.0
 */
package esir3.im


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TwStandaloneSetup extends TwStandaloneSetupGenerated {

	def static void doSetup() {
		new TwStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}