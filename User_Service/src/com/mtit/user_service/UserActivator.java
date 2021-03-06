package com.mtit.user_service;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.communicationcenter.*;
import com.mtit.stationary_service.*;

import cd_service.CD_Details;
import graphic_service.Graphic;
import photocopy_service.PhotoCopy;
import print_service.Print;
import reload_service.Reload;
import scanner_service.ScannerI;



public class UserActivator implements BundleActivator {
	
	ServiceReference serviceReference;
	private static String descision ;
	
	
	public void start(BundleContext context) throws Exception {
		System.out.println("User Service Starts...");
		Scanner input = new Scanner(System.in);
		do {
			int select = ServicesImpl.chooseServiceType();
			
			if (select == 1) {
				serviceReference = context.getServiceReference(Stationary.class.getName());
				Stationary stationary = (Stationary)context.getService(serviceReference);
				ServicesImpl.StationaryService(stationary);
				
			}else if(select == 2) {
				serviceReference = context.getServiceReference(Reload.class.getName());
				Reload reload = (Reload)context.getService(serviceReference);
				ServicesImpl.ReloadService(reload);
				
			}else if(select == 3) {
				serviceReference = context.getServiceReference(CD_Details.class.getName());
				CD_Details cdDetails = (CD_Details)context.getService(serviceReference);
				ServicesImpl.CDService(cdDetails);
				
			}else if(select == 4) {
				serviceReference = context.getServiceReference(Graphic.class.getName());
				Graphic graphic = (Graphic)context.getService(serviceReference);
				ServicesImpl.GraphicService(graphic);
				
			}else if(select == 5) {
				serviceReference = context.getServiceReference(Print.class.getName());
				Print print = (Print)context.getService(serviceReference);
				ServicesImpl.PrintService(print);
				
			}else if(select == 6) {
				serviceReference = context.getServiceReference(PhotoCopy.class.getName());
				PhotoCopy photocopy = (PhotoCopy)context.getService(serviceReference);
				ServicesImpl.PhotoCopyService(photocopy);
				
			}else if(select == 7) {
				serviceReference = context.getServiceReference(ScannerI.class.getName());
				ScannerI scanner = (ScannerI)context.getService(serviceReference);
				ServicesImpl.ScannerService(scanner);
				
			}else {
				System.out.println();
				System.out.println("\t\t\tEnter a valied code .....!");
			}
			System.out.println("\t\t\t*** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\tDo you need to purchase more Items ? [Y/N] ");
			descision = input.next();
			if(descision.equals("N")) {
				ServicesImpl.displaytotalbill();
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
