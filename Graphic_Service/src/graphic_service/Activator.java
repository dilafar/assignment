package graphic_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration graphicServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Graphic Service Starts...");
		Graphic graphic = new GraphicImpl();
		graphicServiceRegistration = context.registerService(Graphic.class.getName(), graphic, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Graphic Service Stops...");
		graphicServiceRegistration.unregister();
	}

}
