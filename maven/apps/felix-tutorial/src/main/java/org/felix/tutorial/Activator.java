package org.felix.tutorial;

/**
 * Hello world!
 *
 */

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
 



public class Activator implements BundleActivator
{
    /**
     * Implements BundleActivator.start(). Registers an
     * instance of a dictionary service using the bundle context;
     * attaches properties to the service that can be queried
     * when performing a service look-up.
     * @param context the framework context for the bundle.
    **/
	/**

	* Implements BundleActivator.start().
	* @param bundleContext - the framework context for the bundle.
	**/

	public void start(BundleContext bundleContext) {
	  System.out.println("Hello World");
	  }
	/**

	* Implements BundleActivator.stop()
	* @param bundleContext - the framework context for the bundle
	**/
	public void stop(BundleContext bundleContext) {
	  System.out.println("Goodbye World");
	  }
}