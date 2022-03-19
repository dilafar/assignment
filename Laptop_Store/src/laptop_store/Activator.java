package laptop_store;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration laptop_storeServiceRegistration;

	public void start(BundleContext context) throws Exception {
			System.out.println("Laptop Store Starts...");
			Laptop laptop = new LaptopImpl();
			laptop_storeServiceRegistration = context.registerService(Laptop.class.getName(), laptop, null);
			
	}

	public void stop(BundleContext context) throws Exception {
		    System.out.println("Laptop Store Stops...");
		    laptop_storeServiceRegistration.unregister();
	}

}
