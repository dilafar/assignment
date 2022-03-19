package onlinestreaming_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration streamServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Streaming Service Starts ... ");
		Stream stream = new StreamImpl();
		streamServiceRegistration = context.registerService(Stream.class.getName(), stream, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Streaming Service ends ... ");
		 streamServiceRegistration.unregister();
	}

}
