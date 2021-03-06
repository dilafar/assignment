package user_service2;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.communicationcenter.ServicesImpl;
import com.mtit.communicationcenter.ServicesImpl2;



import laptop_store.Laptop;
import phone_store.Phone;


public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	private static String descision ;

	
	public void start(BundleContext context) throws Exception {
		System.out.println("User Service Starts...");
		Scanner input = new Scanner(System.in);
		do {
			int select = ServicesImpl2.chooseServiceType2();
			
			if (select == 1) {
				serviceReference = context.getServiceReference(Laptop.class.getName());
				Laptop laptop = (Laptop)context.getService(serviceReference);
				
				ServicesImpl2.LaptopService(laptop);
				
			}else if(select == 2) {
				serviceReference = context.getServiceReference(Phone.class.getName());
				Phone phone = (Phone)context.getService(serviceReference);
				ServicesImpl2.PhoneService(phone);
				
			
				
			}else {
				System.out.println("Enter a valied code .....!");
			}
			System.out.println("\t\t\t*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\tDo you need to purchase more Items ? [Y/N] ");
			descision = input.next();
			if(descision.equals("N")) {
				ServicesImpl2.displaytotalbill();
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
