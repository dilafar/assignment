package com.mtit.communicationcenter;

import java.util.ArrayList;
import java.util.Scanner;

import labtop_repairing_service.Labtop_Repairing;
import labtop_repairing_service.LaptopModel;
import laptop_store.Laptop;
import laptop_store.Laptop_Model;
import phone_repairing_service.Phone_Repairing;
import phone_repairing_service.Phone_Repairing_Model;
import phone_store.Phone;
import phone_store.Phone_Model;

public class ServicesImpl3 {
			
	private static int PhoneSubTotal = 0;
	private static int LaptopSubTotal = 0;
	private static int totalAmount = 0;
	private static String Phone_desision;
	private static String Laptop_desision;
	private static int Services2[] = new int[2];
	
	private static ArrayList<LaptopModel> laptops = new ArrayList<>();
	private static ArrayList<Phone_Repairing_Model> phones = new ArrayList<>();
	
	public static int chooseServiceType3() {
		System.out.println();
		System.out.println();
		System.out.println("____________________________________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("\t\t\t___________________________________________________________");
		System.out.println("");
		System.out.println("\t\t\t\t---- WELLCOME TO OSGI  ----\t\t   ");
		System.out.println("\t\t\t___________________________________________________________");
		System.out.println();
		System.out.println("\t\t\t\t-- Provided Services : ");
		System.out.println();
		System.out.println("\t\t\t\t=> OSGI Communication Center ");
		System.out.println("\t\t\t\t=> OSGI Phone & Laptop Store ");
		System.out.println("\t\t\t\t=> OSGI Phone & Laptop Repairing ");
		System.out.println("\t\t\t\t=> OSGI Streaming Center ");
		
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t___________________________________________________________");
		System.out.println("____________________________________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("\t\t\t___________________________________________________________");
		System.out.println("\t\t\t|\t\t\t\t\t\t\t   |");
		System.out.println("\t\t\t|\t---- OSGI Communication Center ----\t\t   | ");
		System.out.println("\t\t\t|__________________________________________________________|");
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t________________________________________");
		
		System.out.println("\t\t\t\t|code\t\tService\t\t        |");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println();
		System.out.println("\t\t\t\t| 1\tLaptop Repairing Service\t|");
		System.out.println("\t\t\t\t| 2\tPhone Repairing Service \t|");
		
		System.out.println("\t\t\t\t________________________________________");
		
		System.out.println();
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\t => Enter the code of the service you need to Procead : ");
		int x = input.nextInt();
		
		return x;
	

}
	
	public static void LaptopService(Labtop_Repairing laptop) {
		Scanner input = new Scanner(System.in);
		if(Services2[0] != 0) {
			totalAmount = Services2[0];
		}else {
			totalAmount = 0;
		}

		do {
			laptop.Display_Laptop_Repairing();;
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Laptop Type  you need to Purchase ? ");
			int laptop_code = input.nextInt();
			
			
				
				if(laptop_code == 1) {
					
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("change_harddrive");
					System.out.print("\t\t\t=>How many change_harddrive do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.change_harddrive);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code == 2) {
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("ram_upgrade\t");
					System.out.print("\t\t\t=>How many ram_upgrade do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.ram_upgrade);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
					
				}else if(laptop_code == 3) {
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("keyboard_change");
					System.out.print("\t\t\t=>How many keyboard_change do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.keyboard_change);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
					
				}else if(laptop_code == 4) {
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("software_update");
					System.out.print("\t\t\t=>How many software_update do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.software_update);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code == 5) {
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("mouse_pad\t");
					System.out.print("\t\t\t=>How many mouse_pad do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.mouse_pad);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
					
				}else if(laptop_code == 6) {
					LaptopModel laptopmodel = new LaptopModel();
					
					
					laptopmodel.setName("display_change");
					System.out.print("\t\t\t=>How many display_change do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.display_change);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
			
				
			
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			Laptop_desision = input.next();
			
		}while(Laptop_desision.equals("Y"));
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\tLaptop Service Bill Amount : ");
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\tLaptopRepair\t\tQuantity\t\t Amount");
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		for(LaptopModel laptopmodel : laptops ) {
			
				System.out.print("\t\t\t\t"+ laptopmodel.getName());
			
				System.out.print("\t\t"+ laptopmodel.getQty());
			
				System.out.print("\t\t "+ laptopmodel.getSubTotal());
				System.out.println();
			
			
			
		}
		
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t   SubToatal is : "+(double)totalAmount);
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		Services2[0] = totalAmount;
		
		
		
}
	
	
	public static void PhoneService(Phone_Repairing phone) {
		Scanner input = new Scanner(System.in);
		if(Services2[1] != 0) {
			totalAmount = Services2[1];
		}else {
			totalAmount = 0;
		}
		
		do {
			phone.Display_Phone_Repairing();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Phone Type  you need to Purchase ? ");
			int laptop_code1 = input.nextInt();
			
			
				
				if(laptop_code1 == 1) {
					
					Phone_Repairing_Model phonemodel = new Phone_Repairing_Model();
					
					
					phonemodel.setName("display_replacement");
					System.out.print("\t\t\t=>How many display_replacement do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					 PhoneSubTotal = phone.calculateBill(Qty, phone.display_replacement);
					double calculateamount = (double) PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount +=  PhoneSubTotal;
					
				}else if(laptop_code1 == 2) {
					Phone_Repairing_Model phonemodel = new Phone_Repairing_Model();
					
					
					phonemodel.setName("bettery_replacement");
					System.out.print("\t\t\t=>How many bettery_replacement do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					 PhoneSubTotal = phone.calculateBill(Qty, phone.bettery_replacement);
					double calculateamount = (double) PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount +=  PhoneSubTotal;
					
					
				}else if(laptop_code1 == 3) {
					Phone_Repairing_Model phonemodel = new Phone_Repairing_Model();
					
					
					phonemodel.setName("speaker_replacement");
					System.out.print("\t\t\t=>How many speaker_replacement do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					 PhoneSubTotal = phone.calculateBill(Qty, phone.speaker_replacement);
					double calculateamount = (double) PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount +=  PhoneSubTotal;
					
					
				}else if(laptop_code1 == 4) {
					Phone_Repairing_Model phonemodel = new Phone_Repairing_Model();
					
					
					phonemodel.setName("software_change");
					System.out.print("\t\t\t=>How many software_change do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					 PhoneSubTotal = phone.calculateBill(Qty, phone.software_change);
					double calculateamount = (double) PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount +=  PhoneSubTotal;
					
					
				}else if(laptop_code1 == 5) {
					Phone_Repairing_Model phonemodel = new Phone_Repairing_Model();
					
					
					phonemodel.setName("tempt_glass");
					System.out.print("\t\t\t=>How many tempt_glass do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					 PhoneSubTotal = phone.calculateBill(Qty, phone.tempt_glass);
					double calculateamount = (double) PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount +=  PhoneSubTotal;
					
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
			
				
			
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			Phone_desision = input.next();
			
		}while(Phone_desision.equals("Y"));

		
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\tPhoneRepairing Service Bill Amount : ");
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\tPhoneRepair\t\tQuantity\t\t Amount");
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		for(Phone_Repairing_Model phonemodel : phones ) {
			
				System.out.print("\t\t\t\t"+ phonemodel.getName());
			
				System.out.print("\t\t"+ phonemodel.getQty());
			
				System.out.print("\t\t "+ phonemodel.getSubTotal());
				System.out.println();
			
			
			
		}
		
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t   SubToatal is : "+(double)totalAmount);
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		Services2[1] = totalAmount;
		
		
		
}
	
	public static void displaytotalbill() {
		System.out.println();
		System.out.println();
	
		System.out.println("\t\t\t\tTotal Bill for The Services Used By The Customer : ");
		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println("\t\t\t\tService\t\t\t\t    Total Amount\t\t\t ");
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println();
		double tot = 0;
		
		for(int i = 0 ; i<2 ; i++ ) {
			if(i==0) {
				System.out.println("\t\t\t\t Laptop Repairing Service\t\t"+"RS."+Services2[i]+".00");
			}else if(i==1) {
				System.out.println("\t\t\t\t Phone Repairing Service\t\t"+"RS."+Services2[i]+".00");
			
			}
			tot += Services2[i];
		}
		
		
	
		
		
		
		
		

		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Total Bill is : "+tot);
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println();
	}

}
