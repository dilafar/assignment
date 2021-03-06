package com.mtit.communicationcenter;

import java.util.ArrayList;
import java.util.Scanner;

import labtop_repairing_service.Labtop_Repairing;
import labtop_repairing_service.LaptopModel;
import onlinestreaming_service.Stream;
import onlinestreaming_service.StreamModel;
import phone_repairing_service.Phone_Repairing;
import phone_repairing_service.Phone_Repairing_Model;

public class ServicesImpl4 {

	private static int StreamSubTotal = 0;

	private static int totalAmount = 0;
	private static String Stream_desision;

	private static int Services2[] = new int[1];
	
	private static ArrayList<StreamModel> streams = new ArrayList<>();

	
	public static int chooseServiceType4() {
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
		System.out.println("\t\t\t\t| 1\tonline Streaming Service\t|");
		
		
		System.out.println("\t\t\t\t________________________________________");
		
		System.out.println();
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\t => Enter the code of the service you need to Procead : ");
		int x = input.nextInt();
		
		return x;
	

}
	
	public static void StreamService(Stream stream) {
		Scanner input = new Scanner(System.in);
		if(Services2[0] != 0) {
			totalAmount = Services2[0];
		}else {
			totalAmount = 0;
		}

		do {
			stream.DisplayStream();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Stream Type  you need to Purchase ? ");
			int stream_code = input.nextInt();
			
			
				
				if(stream_code == 1) {
					StreamModel streammodel = new StreamModel();
					
					
					streammodel.setName("twitch stream per - hour");
					System.out.print("\t\t\t=>How many twitch stream per - hour do you need to purchase ?");
					int hours = input.nextInt();
					streammodel.setHoures(hours);
					StreamSubTotal = stream.calculateBill(hours, stream.twitch_stream_per_hour);
					double calculateamount = (double)StreamSubTotal;
					streammodel.setSubtotal(calculateamount);
					streams.add(streammodel);
					totalAmount += StreamSubTotal;
					
				}else if(stream_code == 2) {
					StreamModel streammodel = new StreamModel();
					
					
					streammodel.setName("youtube stream per - hour");
					System.out.print("\t\t\t=>How many youtube stream per - hour do you need to purchase ?");
					int hours = input.nextInt();
					streammodel.setHoures(hours);
					StreamSubTotal = stream.calculateBill(hours, stream.youtube_stream_hour);
					double calculateamount = (double)StreamSubTotal;
					streammodel.setSubtotal(calculateamount);
					streams.add(streammodel);
					totalAmount += StreamSubTotal;
					
					
				}else if(stream_code == 3) {
					StreamModel streammodel = new StreamModel();
					
					
					streammodel.setName("gaming stream per - hour");
					System.out.print("\t\t\t=>How many gaming stream per - hour do you need to purchase ?");
					int hours = input.nextInt();
					streammodel.setHoures(hours);
					StreamSubTotal = stream.calculateBill(hours, stream.gaming_stream_hour);
					double calculateamount = (double)StreamSubTotal;
					streammodel.setSubtotal(calculateamount);
					streams.add(streammodel);
					totalAmount += StreamSubTotal;
					
					
				}else if(stream_code == 4) {
					StreamModel streammodel = new StreamModel();
					
					
					streammodel.setName("play game with team per - hour");
					System.out.print("\t\t\t=>How many play game with team per - hour do you need to purchase ?");
					int hours = input.nextInt();
					streammodel.setHoures(hours);
					StreamSubTotal = stream.calculateBill(hours, stream.play_game_team_hour);
					double calculateamount = (double)StreamSubTotal;
					streammodel.setSubtotal(calculateamount);
					streams.add(streammodel);
					totalAmount += StreamSubTotal;
					
				
				
					
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
			
				
			
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			Stream_desision = input.next();
			
		}while(Stream_desision.equals("Y"));
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\tStream Service Bill Amount : ");
		System.out.println();
		System.out.println("\t\t\t\t________________________________________________________________");
		System.out.println("\t\t\t\tStream\t\t\t\t houres\t\t\t Amount");
		System.out.println("\t\t\t\t________________________________________________________________");
		System.out.println();
		
		for(StreamModel streammodel : streams ) {
			
				System.out.print("\t\t\t\t"+ streammodel.getName());
			
				System.out.print("\t\t"+  streammodel.getHoures());
			
				System.out.print("\t\t "+ streammodel.getSubtotal());
				System.out.println();
			
			
			
		}
		
		System.out.println();
		System.out.println("\t\t\t\t________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t   SubToatal is : "+(double)totalAmount);
		System.out.println("\t\t\t\t________________________________________________________________");
		System.out.println();
		
		Services2[0] = totalAmount;
		
		
		
}
	
	
	
	
	public static void displaytotalbill() {
		System.out.println();
		System.out.println();
	
		System.out.println("\t\t\t\tTotal Bill for The Services Used By The Customer : ");
		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println("\t\t\t\tService\t\t    Total Amount\t\t\t ");
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println();
		double tot = 0;
		
		for(int i = 0 ; i<2 ; i++ ) {
			if(i==0) {
				System.out.println("\t\t\t\t Streaming Service\t\t"+"RS."+Services2[i]+".00");
			
			tot += Services2[i];
		}
		}
		
		
	
		
		
		
		
		

		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t Total Bill is : "+tot);
		System.out.println("\t\t\t\t______________________________________________________________________");
		System.out.println();
	}
}

