package photocopy_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration photocopyServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("PhotoCopy Service Starts...");
		PhotoCopy photocopy = new PhotoCopyImpl();
		photocopyServiceRegistration = context.registerService(PhotoCopy.class.getName(), photocopy, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("PhotoCopy Service Stops...");
		photocopyServiceRegistration.unregister();
		
	}

}
