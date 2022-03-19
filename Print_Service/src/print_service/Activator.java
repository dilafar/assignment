package print_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration printServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Print Service Starts...");
		Print print = new PrintImpl();
		printServiceRegistration = context.registerService(Print.class.getName(), print, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Print Service Stop...");
		printServiceRegistration.unregister();
	}

}
