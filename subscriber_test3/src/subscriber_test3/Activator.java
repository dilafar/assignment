package subscriber_test3;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import test3.Publisher_interface;

public class Activator implements BundleActivator {

	ServiceReference subscriberreference;

	

	public void start(BundleContext context) throws Exception {
		System.out.println("Subcriber works...");
		subscriberreference = context.getServiceReference(Publisher_interface.class.getName());
		Publisher_interface publisher = (Publisher_interface)context.getService(subscriberreference);
		publisher.Printdetails();
		
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Subcriber stops...");
		context.ungetService(subscriberreference);
		
	}

}
