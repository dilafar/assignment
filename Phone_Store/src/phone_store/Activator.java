package phone_store;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration Phone_Store_ServiceRegistration;

	public void start(BundleContext context) throws Exception {
				System.out.println("Phone Store Starts....");
				Phone phone = new PhoneImpl();
				Phone_Store_ServiceRegistration = context.registerService(Phone.class.getName(), phone, null);
	}

	public void stop(BundleContext context) throws Exception {
				System.out.println("Phone Store ends....");
				Phone_Store_ServiceRegistration.unregister();
	}

}
