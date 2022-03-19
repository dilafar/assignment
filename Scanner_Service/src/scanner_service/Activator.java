package scanner_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration scannerServiceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Scanner Service Starts...");
		ScannerI scanner = new ScannerImpl();
		scannerServiceRegistration = context.registerService(ScannerI.class.getName(), scanner, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Scanner Service Stops...");
		scannerServiceRegistration.unregister();
	}

}
