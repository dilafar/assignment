package labtop_repairing_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration laptopServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Laptop Service Starts...");
		Labtop_Repairing laptop = new Laptop_RepairingImpl();
		laptopServiceRegistration = context.registerService(Labtop_Repairing.class.getName(), laptop, null);
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Laptop Service Stops...");
		laptopServiceRegistration.unregister();
	}

}
