package user_service4;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.communicationcenter.ServicesImpl3;
import com.mtit.communicationcenter.ServicesImpl4;


import onlinestreaming_service.Stream;


public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	private static String descision ;

	public void start(BundleContext context) throws Exception {
		System.out.println("User Service Starts...");
		Scanner input = new Scanner(System.in);
		do {
			int select = ServicesImpl4.chooseServiceType4();
			
			if (select == 1) {
				serviceReference = context.getServiceReference(Stream.class.getName());
				Stream stream = (Stream)context.getService(serviceReference);
				
				ServicesImpl4.StreamService(stream);
				
			
			}else {
				System.out.println("Enter a valied code .....!");
			}
			System.out.println("\t\t\t*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\tDo you need to purchase more Items ? [Y/N] ");
			descision = input.next();
			if(descision.equals("N")) {
				ServicesImpl4.displaytotalbill();
				System.out.println("Enter Any Number to Exit : ");
				int x = input.nextInt();
			}
			
		}while(descision.equals("Y"));
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("User Stoped.....");
		context.ungetService(serviceReference);
	}

}
