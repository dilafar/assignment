package test3;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publisherregister;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Started....");Publisher_interface publisher = new PublisherImpl();
		publisherregister = context.registerService(Publisher_interface.class.getName(),publisher , null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stops....");
		 publisherregister.unregister();
	}

}
