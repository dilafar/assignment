package user_service3;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.communicationcenter.ServicesImpl2;
import com.mtit.communicationcenter.ServicesImpl3;

import labtop_repairing_service.Labtop_Repairing;

import phone_repairing_service.Phone_Repairing;


public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	private static String descision ;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("User Service Starts...");
		Scanner input = new Scanner(System.in);
		do {
			int select = ServicesImpl3.chooseServiceType3();
			
			if (select == 1) {
				serviceReference = context.getServiceReference(Labtop_Repairing.class.getName());
				Labtop_Repairing laptop = (Labtop_Repairing)context.getService(serviceReference);
				
				ServicesImpl3.LaptopService(laptop);
				
			}else if(select == 2) {
				
				serviceReference = context.getServiceReference(Phone_Repairing.class.getName());
				Phone_Repairing phone = (Phone_Repairing)context.getService(serviceReference);
				ServicesImpl3.PhoneService(phone);
				
			
				
			}else {
				System.out.println("Enter a valied code .....!");
			}
			System.out.println("\t\t\t*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\tDo you need to purchase more Items ? [Y/N] ");
			descision = input.next();
			if(descision.equals("N")) {
				ServicesImpl3.displaytotalbill();
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
