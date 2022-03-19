package phone_repairing_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration phoneServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Phone Repiring Service Starts...");
		Phone_Repairing phone = new Phone_RepairingImpl();
		phoneServiceRegistration = context.registerService(Phone_Repairing.class.getName(), phone, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Phone Repiring Service...");
		phoneServiceRegistration.unregister();
	}

}
