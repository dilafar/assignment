package com.mtit.communicationcenter;

import java.util.ArrayList;
import java.util.Scanner;

import com.mtit.stationary_service.StationaryModel;

import laptop_store.Laptop;
import laptop_store.Laptop_Model;
import phone_store.Phone;
import phone_store.Phone_Model;
import reload_service.Reload;
import reload_service.ReloadModel;

public class ServicesImpl2 {
	
	private static int PhoneSubTotal = 0;
	private static int LaptopSubTotal = 0;
	private static int totalAmount = 0;
	private static String Phone_desision;
	private static String Laptop_desision;
	private static int Services2[] = new int[2];
	
	private static ArrayList<Laptop_Model> laptops = new ArrayList<>();
	private static ArrayList<Phone_Model> phones = new ArrayList<>();
	
	public static int chooseServiceType2() {
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
		System.out.println("\t\t\t\t| 1\tLaptop Store Service\t\t|");
		System.out.println("\t\t\t\t| 2\tPhone Store Service \t\t|");
		
		System.out.println("\t\t\t\t________________________________________");
		
		System.out.println();
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\t => Enter the code of the service you need to Procead : ");
		int x = input.nextInt();
		
		return x;
	

}
	
	public static void LaptopService(Laptop laptop) {
		Scanner input = new Scanner(System.in);
		if(Services2[0] != 0) {
			totalAmount = Services2[0];
		}else {
			totalAmount = 0;
		}

		do {
			laptop.Display_Laptop();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Laptop Type  you need to Purchase ? ");
			int laptop_code = input.nextInt();
			
			if(laptop_code  == 1) {
				laptop.Display_Apple();
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of laptop Type  you need to Purchase ? ");
				int laptop_code1 = input.nextInt();
				
				if(laptop_code1 == 1) {
					
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Macbook Pro");
					System.out.print("\t\t\t=>How many Macbook Pro do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Macbookpro);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code1 == 2) {
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Macbook Air");
					System.out.print("\t\t\t=>How many Macbook Air do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.macbookair);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
			}else if(laptop_code  == 2) {
				
				laptop.Display_Dell();;
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of laptop Type  you need to Purchase ? ");
				int laptop_code2 = input.nextInt();
				
				if(laptop_code2 == 1) {
					
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Dell latitute");
					System.out.print("\t\t\t=>How many Dell latitute do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Dell_latitute);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code2 == 2) {
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Dell inspiron");
					System.out.print("\t\t\t=>How many Dell inspiron do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Dell_inspiron);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code2 == 3) {
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Dell alionware");
					System.out.print("\t\t\t=>How many Dell alionware do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Dell_alionware);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
					
			}else if(laptop_code  == 3) {
				laptop.Display_Asus();;
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of laptop Type  you need to Purchase ? ");
				int laptop_code3 = input.nextInt();
				
				if(laptop_code3 == 1) {
					
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Asus rog");
					System.out.print("\t\t\t=>How many Asus rog do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Asus_rog);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code3 == 2) {
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Asus vivobook");
					System.out.print("\t\t\t=>How many Asus vivobook do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Asus_vivobook);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				}else if(laptop_code3 == 3) {
					Laptop_Model laptopmodel = new Laptop_Model();
					
					
					laptopmodel.setName("Asus notebook");
					System.out.print("\t\t\t=>How many Asus notebook do you need to purchase ?");
					int Qty = input.nextInt();
					laptopmodel.setQty(Qty);
					LaptopSubTotal = laptop.calculateBill(Qty, laptop.Asus_notebook);
					double calculateamount = (double)LaptopSubTotal;
					laptopmodel.setSubTotal(calculateamount);
					laptops.add(laptopmodel);
					totalAmount += LaptopSubTotal;
					
				
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
				
				
			} else {
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
		System.out.println("\t\t\t\tLaptopType\t\tQuantity\t\t Amount");
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		for(Laptop_Model laptopmodel : laptops ) {
			
				System.out.print("\t\t\t\t"+ laptopmodel.getName());
			
				System.out.print("\t\t"+ laptopmodel.getQty());
			
				System.out.print("\t\t\t"+ laptopmodel.getSubTotal());
				System.out.println();
			
			
			
		}
		
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t   SubToatal is : "+(double)totalAmount);
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		Services2[0] = totalAmount;
		
		
		
}
	
	
	public static void PhoneService(Phone phone) {
		Scanner input = new Scanner(System.in);
		if(Services2[1] != 0) {
			totalAmount = Services2[1];
		}else {
			totalAmount = 0;
		}

		do {
			phone.DisplayPhone();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Phone Type  you need to Purchase ? ");
			int phone_code = input.nextInt();
			
			if(phone_code   == 1) {
				phone.Display_Iphone();
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of Phone Type  you need to Purchase ? ");
				int phone_code1 = input.nextInt();
				
				if(phone_code1 == 1) {
					
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("iphone X");
					System.out.print("\t\t\t=>How many iphone X do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.iphoneX);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code1 == 2) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("iphone 11");
					System.out.print("\t\t\t=>How many iphone 11 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.iphone11);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code1 == 3) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("iphone 12");
					System.out.print("\t\t\t=>How many iphone 12 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.iphone12);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
				}else if(phone_code1 == 4) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("iphone XS Max");
					System.out.print("\t\t\t=>How many iphone XS Max do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.iphone_XS_Max);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
			}else if(phone_code  == 2) {
				phone.Display_Huawei();
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of Phone Type  you need to Purchase ? ");
				int phone_code2 = input.nextInt();
				
				if(phone_code2 == 1) {
					
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Huawei Y7");
					System.out.print("\t\t\t=>How many Huawei Y7 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Huawei_Y7);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code2 == 2) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Huawei p50");
					System.out.print("\t\t\t=>How many Huawei p50 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Huawei_p50);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code2 == 3) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Huawei p30_pro");
					System.out.print("\t\t\t=>How many Huawei p30_pro do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Huawei_p30_pro);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
				
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
				
				
					
			}else if(phone_code  == 3) {
				phone.Display_Sumsung();
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of Phone Type  you need to Purchase ? ");
				int phone_code3 = input.nextInt();
				
				if(phone_code3 == 1) {
					
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Sumsung s22");
					System.out.print("\t\t\t=>How many Sumsung s22 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Sumsung_s22);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code3 == 2) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Sumsung s21");
					System.out.print("\t\t\t=>How many Sumsung s21 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Sumsung_s21);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
					
				}else if(phone_code3 == 3) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Sumsung s20");
					System.out.print("\t\t\t=>How many Sumsung s20 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Sumsung_s20);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
				}else if(phone_code3 == 4) {
					Phone_Model phonemodel = new Phone_Model();
					
					
					phonemodel.setName("Sumsung s10");
					System.out.print("\t\t\t=>How many Sumsung s10 do you need to purchase ?");
					int Qty = input.nextInt();
					phonemodel.setQty(Qty);
					PhoneSubTotal = phone.calculateBill(Qty, phone.Sumsung_s10);
					double calculateamount = (double)PhoneSubTotal;
					phonemodel.setSubTotal(calculateamount);
					phones.add(phonemodel);
					totalAmount += PhoneSubTotal;
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
				
			} else {
				   System.out.println("\t\t\t=>Please enter a valied code ....");
			   }
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			Phone_desision = input.next();
			
		}while(Phone_desision.equals("Y"));
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\tPhone Service Bill Amount : ");
		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println("\t\t\t\tPhoneType\t\tQuantity\t\t Amount");
		System.out.println("\t\t\t\t__________________________________________________________");
		System.out.println();
		
		for(Phone_Model phonemodel : phones ) {
			
				System.out.print("\t\t\t\t"+phonemodel.getName());
			
				System.out.print("\t\t"+phonemodel.getQty());
			
				System.out.print("\t\t\t"+phonemodel.getSubTotal());
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
		System.out.println("\t\t\t\t__________________________________________________________________________");
		System.out.println("\t\t\t\tService\t\t    Total Amount\t\t\t ");
		System.out.println("\t\t\t\t__________________________________________________________________________");
		System.out.println();
		double tot = 0;
		
		for(int i = 0 ; i<2 ; i++ ) {
			if(i==0) {
				System.out.println("\t\t\t\t Laptop Service\t\t"+"RS."+Services2[i]+".00");
			}else if(i==1) {
				System.out.println("\t\t\t\t Phone Service\t\t"+"RS."+Services2[i]+".00");
			
			}
			tot += Services2[i];
		}
		
		
	
		
		
		
		
		

		System.out.println();
		System.out.println("\t\t\t\t__________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Total Bill is : "+tot);
		System.out.println("\t\t\t\t__________________________________________________________________________");
		System.out.println();
	}



}
