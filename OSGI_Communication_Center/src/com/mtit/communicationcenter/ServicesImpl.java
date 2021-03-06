package com.mtit.communicationcenter;

import java.util.ArrayList;

import java.util.Scanner;
import com.mtit.stationary_service.*;

import cd_service.CDModel;
import cd_service.CD_Details;
import graphic_service.Graphic;
import graphic_service.GraphicModel;
import photocopy_service.PhotoCopy;
import photocopy_service.PhotoCopyModel;
import print_service.Print;
import print_service.PrintModel;
import reload_service.Reload;
import reload_service.ReloadModel;
import scanner_service.ScannerI;
import scanner_service.ScannerModel;

public class ServicesImpl {
	private static int StationarySubTotal = 0;
	private static int ReloadSubTotal = 0;
	private static int CDSubtotal = 0;
	private static int GraphicSubtotal = 0;
	private static int PrintSubtotal = 0;
	private static int PhotocopySubtotal = 0;
	private static int ScannerSubtotal = 0;
	private static int totalAmount = 0;
	private static String stationary_desision;
	private static String reload_desision;
	private static String CD_desision;
	private static String Graphic_desision;
	private static String Print_desision;
	private static String PhotoCopy_desision;
	private static String Scanner_desision;
	private static int Services[] = new int[7];
	
	
	
	private static ArrayList<StationaryModel> Stationaries = new ArrayList<>();
	private static ArrayList<ReloadModel> Reloadcards = new ArrayList<>();
	private static ArrayList<CDModel> CDList = new ArrayList<>();
	private static ArrayList<GraphicModel> GraphicList = new ArrayList<>();
	private static ArrayList<PrintModel> PrintedList = new ArrayList<>();
	private static ArrayList<PhotoCopyModel> photocopylist = new ArrayList<>();
	private static ArrayList<ScannerModel> scannerlist = new ArrayList<>();
	
	public static int chooseServiceType() {
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
		System.out.println("\t\t\t\t| 1\tStationary Service\t\t|");
		System.out.println("\t\t\t\t| 2\tReload Service\t\t\t|");
		System.out.println("\t\t\t\t| 3\tCD Service \t\t\t|");
		System.out.println("\t\t\t\t| 4\tGraphic Service \t\t| ");
		System.out.println("\t\t\t\t| 5\tPrinting Service\t\t| ");
		System.out.println("\t\t\t\t| 6\tPhotoCopy Service \t\t|");
		System.out.println("\t\t\t\t| 7\tScanning Service\t\t| ");
		System.out.println("\t\t\t\t| 8\tBrowsing and Gaming  Service \t|");
		System.out.println("\t\t\t\t________________________________________");
		
		System.out.println();
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\t => Enter the code of the service you need to Procead : ");
		int x = input.nextInt();
		
		return x;
	

}
	public static void StationaryService(Stationary stationary) {
		Scanner input = new Scanner(System.in);
		if(Services[0] != 0) {
			totalAmount = Services[0];
		}else {
			totalAmount = 0;
		}
		
		do {
			stationary.DisplayStationeries();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Stationary Item you need to Purchase ? ");
			int code = input.nextInt();
			if(code == 1) {
				StationaryModel stationarymodel = new StationaryModel();
				stationarymodel.setName("A4Paper-White		");
				
				System.out.print("\t\t\t=>How many A4Papers do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.A4paper_white);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				Stationaries.add(stationarymodel);
				totalAmount += StationarySubTotal;
				
			}else if(code == 2) {
					StationaryModel stationarymodel = new StationaryModel();
				
					
					stationarymodel.setName("A4Paper-Color		");
					System.out.print("\t\t\t=>How many A4Papers do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.A4paper_color);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;	
				
			}else if(code == 3) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Scissores		");
				System.out.print("\t\t\t=>How many Scissores do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Scisores);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				Stationaries.add(stationarymodel);
				totalAmount += StationarySubTotal;	
				
			}else if(code == 4) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Pencil		");
				System.out.print("\t\t\t=>How many Pencil do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Pencil);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				Stationaries.add(stationarymodel);
				totalAmount += StationarySubTotal;	
				
			}else if(code == 5) {
				StationaryModel stationarymodel = new StationaryModel();
				
				
				stationarymodel.setName("Erasor		");
				System.out.print("\t\t\t=>How many Erasor do you need to purchase ?");
				int Qty = input.nextInt();
				stationarymodel.setQty(Qty);
				StationarySubTotal = stationary.calculateBill(Qty, stationary.Erasor);
				double calculateamount = (double)StationarySubTotal;
				stationarymodel.setSubTotal(calculateamount);
				Stationaries.add(stationarymodel);
				totalAmount += StationarySubTotal;
				
			}else if(code == 6) {
				
				
				stationary.DisplayExerciseBookSingleRule();
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of ExerciseBooks  you need to Purchase ? ");
				int code2 = input.nextInt();
				
				if(code2 == 1) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-80Page-SingleRule");
					System.out.print("\t\t\t=>How many ExerciseBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_80Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
				}else if(code2 == 2) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-120Page-SingleRule");
					System.out.print("\t\t\t=>How many ExerciseBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_120Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 3) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-160Page-SingleRule");
					System.out.print("\t\t\t=>How many ExerciseBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_160Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 4) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-200Page-SingleRule");
					System.out.print("\t\t\t=>How many ExerciseBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_200Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 5) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-240Page-SingleRule");
					System.out.print("\t\t\t=>How many ExerciseBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_240Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 6) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-80Page-SingleRule");
					System.out.print("\t\t\t=>How many CRBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_80page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 7) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-120Page-SingleRule");
					System.out.print("\t\t\t=>How many CRBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_120page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 8) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-160Page-SingleRule");
					System.out.print("\t\t\t=>How many CRBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_160page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 9) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-200Page-SingleRule");
					System.out.print("\t\t\t=>How many CRBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_200page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code2 == 10) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("CRBook-240Page-SingleRule");
					System.out.print("\t\t\t=>How many CRBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_240page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				   }
				
			}else if(code == 7) {
				stationary.DisplayExerciseBookSqureRule();;
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t=>Enter the code of ExerciseBooks  you need to Purchase ? ");
				int code3 = input.nextInt();
				
				if(code3 == 1) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("ExerciseBook-80Page-SquareRule");
					System.out.print("\t\t\t=>How many ExerciseBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
				     stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_80Page);
					double calculateamount = (double)StationarySubTotal;
					stationarymodel.setSubTotal(calculateamount);
					Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
				}else if(code3 == 2) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-120Page-SquareRule");
					System.out.print("\t\t\t=>How many ExerciseBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_120Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 3) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-160Page-SquareRule");
					System.out.print("\t\t\t=>How many ExerciseBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_160Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 4) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("ExerciseBook-200Page-SquareRule");
					System.out.print("\t\t\t=>How many ExerciseBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_200Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 5) {
					StationaryModel stationarymodel = new StationaryModel();
					
				
					stationarymodel.setName("ExerciseBook-240Page-SquareRule");
					System.out.print("\t\t\t=>How many ExerciseBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.ExerciseBook_240Page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 6) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-80Page-SquareRule");
					System.out.print("\t\t\t=>How many CRBook-80Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_80page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 7) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-120Page-SquareRule");
					System.out.print("\t\t\t=>How many CRBook-120Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_120page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 8) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					stationarymodel.setName("CRBook-160Page-SquareRule");
					System.out.print("\t\t\t=>How many CRBook-160Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_160page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 9) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					 stationarymodel.setName("CRBook-200Page-SquareRule");
					System.out.print("\t\t\t=>How many CRBook-200Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_200page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					
				}else if(code3 == 10) {
					StationaryModel stationarymodel = new StationaryModel();
					
					
					 stationarymodel.setName("CRBook-240Page-SquareRule");
					System.out.print("\t\t\t=>How many CRBook-240Page do you need to purchase ?");
					int Qty = input.nextInt();
					 stationarymodel.setQty(Qty);
					StationarySubTotal = stationary.calculateBill(Qty, stationary.CRBook_240page);
					double calculateamount = (double)StationarySubTotal;
					 stationarymodel.setSubTotal(calculateamount);
					 Stationaries.add(stationarymodel);
					totalAmount += StationarySubTotal;
					}else {
						   System.out.println("Please enter a valied code ....");
					   }
			   }else if(code == 8) {
				   	
				   
				    stationary.NoteBook();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of NoteBook you need to Purchase ? ");
					int code4 = input.nextInt();
					
					if(code4 == 1) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-40Page     ");
						System.out.print("\t\t\t=>How many NoteBook-40Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_40page);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code4 == 2) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-80Page     ");
						System.out.print("\t\t\t=>How many NoteBook-80Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_80page);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code4 == 3) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("NoteBook-120Page    ");
						System.out.print("\t\t\t=>How many NoteBook-120Page do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.NoteBook_120page);
						double calculateamount = (double)StationarySubTotal;
						
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
					}else {
						   System.out.println("\t\t\tPlease enter a valied code ....");
					   }
					
					
			  }else if (code == 9) {
			    	   
				    stationary.AtlesPen();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Pen you need to Purchase ? ");
					int code5 = input.nextInt();
					
					if(code5 == 1) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Atlas    \t");
						System.out.print("\t\t\t=>How many BollPoint-Pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 2) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("ButterGel-Pen-Atlas    \t");
						System.out.print("\t\t\t=>How many ButterGel-Pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_ButterGel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
					}else if(code5 == 3) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Atlas        \t");
						System.out.print("\t\t\t=>How many Gel-pen-Atlas do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Atlas_Gell);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 4) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Linc     \t");
						System.out.print("\t\t\t=>How many BollPoint-Pen-Linc do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_linc_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 5) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Linc        \t");
						System.out.print("\t\t\t=>How many Gel-pen-Linc do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_linc_Gel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 6) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("BollPoint-Pen-Ten     \t ");
						System.out.print("\t\t\t=>How many BollPoint-Pen-Ten do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Ten_Bollpoint);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else if(code5 == 7) {
						StationaryModel stationarymodel = new StationaryModel();
						
						
						stationarymodel.setName("Gel-pen-Ten       \t ");
						System.out.print("\t\t\t=>How many Gel-pen-Ten do you need to purchase ?");
						int Qty = input.nextInt();
						stationarymodel.setQty(Qty);
						StationarySubTotal = stationary.calculateBill(Qty, stationary.Pen_Ten_Gel);
						double calculateamount = (double)StationarySubTotal;
						stationarymodel.setSubTotal(calculateamount);
						Stationaries.add(stationarymodel);
						totalAmount += StationarySubTotal;
						
					}else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					   }
					
					
					
			   }else {
				   System.out.println("\t\t\t=>Please enter a valied code ....");
			   }
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			stationary_desision = input.next();
			
			
			
			
		}while(stationary_desision.equals("Y"));
		System.out.println();
		System.out.println();
		
		System.out.println("\t\t\t\tStationary Service Bill Amount  : ");
		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________________________________________");
		System.out.println("\t\t\t\tStationaryItem\t\t\t\t\t\t Quantity\t\t   Amount");
		System.out.println("\t\t\t\t______________________________________________________________________________________________________");
		System.out.println();
		
		for(StationaryModel stationarymodel : Stationaries) {
				
				System.out.print("\t\t\t\t"+ stationarymodel.getName());
			
			
				System.out.print("\t\t\t\t"+ stationarymodel.getQty());
			
				System.out.print("\t\t\t"+ stationarymodel.getSubTotal());
		
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("\t\t\t\t______________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tSubtotoal is : "+(double)totalAmount);
		System.out.println("\t\t\t\t______________________________________________________________________________________________________");
		System.out.println();
		
		Services[0] = totalAmount;
		
		
		}
	
	public static void ReloadService(Reload reload) {
				Scanner input = new Scanner(System.in);
				if(Services[1] != 0) {
					totalAmount = Services[1];
				}else {
					totalAmount = 0;
				}
		
				do {
					reload.DisplayReloadCards();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of ReloadCard Type  you need to Purchase ? ");
					int reload_code = input.nextInt();
					
					if(reload_code  == 1) {
						reload.DisplayDialogCards();
						System.out.println();
						System.out.println();
						System.out.print("\t\t\t=>Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code1 = input.nextInt();
						
						if(reload_code1 == 1) {
							
							ReloadModel reloadmodel = new ReloadModel();
							
							
							reloadmodel.setName("Dialog-ReloadCard-50");
							System.out.print("\t\t\t=>How many Dialog-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							
							
							reloadmodel.setName("Dialog-ReloadCard-100");
							System.out.print("\t\t\t=>How many Dialog-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-49");
							System.out.print("\t\t\t=>How many Dialog-DataCard-49 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_49);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-99");
							System.out.print("\t\t\t=>How many Dialog-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-199");
							System.out.print("\t\t\t=>How many Dialog-DataCard-199 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_199);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code1 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Dialog-DataCard-249");
							System.out.print("\t\t\t=>How many Dialog-DataCard-249 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_249);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("\t\t\t=>Please enter a valied code ....");
						}
						
					}else if(reload_code  == 2) {
						
						reload.DisplayHutchCards();;
						System.out.println();
						System.out.println();
						System.out.print("\t\t\t=>Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code2 = input.nextInt();
						
						if(reload_code2 == 1) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-ReloadCard-50");
							System.out.print("\t\t\t=>How many Hutch-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-ReloadCard-100");
							System.out.print("\t\t\t=>How many Hutch-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-48");
							System.out.print("\t\t\t=>How many Hutch-DataCard-48 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_48_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-99");
							System.out.print("\t\t\t=>How many Hutch-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-198");
							System.out.print("\t\t\t=>How many Hutch-DataCard-198 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_198_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code2 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Hutch-DataCard-649");
							System.out.print("\t\t\t=>How many Hutch-DataCard-649 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_649_hutch);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("\t\t\t=>Please enter a valied code ....");
						}
						
					}else if(reload_code  == 3) {
						
						reload.DisplayMobitelCards();
						System.out.println();
						System.out.println();
						System.out.print("\t\t\t=>Enter the code of ReloadCard Type  you need to Purchase ? ");
						int reload_code3 = input.nextInt();
						
						if(reload_code3 == 1) {
							ReloadModel reloadmodel = new ReloadModel();
						
							reloadmodel.setName("Mobitel-ReloadCard-50");
							System.out.print("\t\t\t=>How many Mobitel-ReloadCard-50 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_50);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 2) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-ReloadCard-100");
							System.out.print("\t\t\t=>How many Mobitel-ReloadCard-100 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_100);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 3) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-DataCard-49");
							System.out.print("\t\t\t=>How many Mobitel-DataCard-49 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_49);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 4) {
							ReloadModel reloadmodel = new ReloadModel();
							
							reloadmodel.setName("Mobitel-DataCard-99");
							System.out.print("\t\t\t=>How many Mobitel-DataCard-99 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_99);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 5) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Mobitel-DataCard-199");
							System.out.print("\t\t\t=>How many Mobitel-DataCard-199 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_199);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else if(reload_code3 == 6) {
							ReloadModel reloadmodel = new ReloadModel();
							reloadmodel.setName("Mobitel-DataCard-249");
							System.out.print("\t\t\t=>How many Mobitel-DataCard-249 do you need to purchase ?");
							int Qty = input.nextInt();
							reloadmodel.setQty(Qty);
							ReloadSubTotal = reload.calculateBill(Qty, reload.reload_249);
							double calculateamount = (double)ReloadSubTotal;
							reloadmodel.setSubTotal(calculateamount);
							Reloadcards.add(reloadmodel);
							totalAmount += ReloadSubTotal;
							
						}else {
							   System.out.println("\t\t\t=>Please enter a valied code ....");
						}
						
					} else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					   }
					
					System.out.println();
					System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
					System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
					reload_desision = input.next();
					
				}while(reload_desision.equals("Y"));
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t\tReload Service Bill Amount : ");
				System.out.println();
				System.out.println("\t\t\t\t__________________________________________________________");
				System.out.println("\t\t\t\tReloadType\t\tQuantity\t\t Amount");
				System.out.println("\t\t\t\t__________________________________________________________");
				System.out.println();
				
				for(ReloadModel reloadmodel : Reloadcards ) {
					
						System.out.print("\t\t\t\t"+ reloadmodel.getName());
					
						System.out.print("\t\t"+ reloadmodel.getQty());
					
						System.out.print("\t\t "+ reloadmodel.getSubTotal());
						System.out.println();
					
					
					
				}
				
				System.out.println();
				System.out.println("\t\t\t\t__________________________________________________________");
				System.out.println("\t\t\t\t\t\t\t\t   SubToatal is : "+(double)totalAmount);
				System.out.println("\t\t\t\t__________________________________________________________");
				System.out.println();
				
				Services[1] = totalAmount;
				
				
				
	}
	
	public static void CDService(CD_Details cdDetails) {
		Scanner input = new Scanner(System.in);
		if(Services[2] != 0) {
			totalAmount = Services[2];
		}else {
			totalAmount = 0;
		}
		
		do {
			cdDetails.DisplayCDDetails();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of CD Type  you need to Purchase ? ");
			int CD_code = input.nextInt();
			
				if(CD_code == 1) {
					cdDetails.DisplayGamingCD();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of GamingCD Type  you need to Purchase ? ");
					int CD_code1 = input.nextInt();
					
					if(CD_code1 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("BattleShip");
						System.out.print("\t\t\t=>How many BattleShip-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Battle_Ship);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code1 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Axis and Allies");
						System.out.print("\t\t\t=>How many Axis and Allies-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.AxisandAllies);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Burn Cycle");
						System.out.print("\t\t\t=>How many Burn Cycle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.BurnCycle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Dark Castle");
						System.out.print("\t\t\t=>How many Dark Castle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.DarkCastle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code1 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Earth Command");
						System.out.print("\t\t\t=>How many Earth Command-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Earth_Command);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
				}else if(CD_code == 2) {
					
					cdDetails.DisplaySoftwareLicenceCD();;
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Software Licence CD Type  you need to Purchase ? ");
					int CD_code2 = input.nextInt();
					
					if(CD_code2 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-7\t");
						System.out.print("\t\t\t=>How many Windows-7-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_7);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code2 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-8\t");
						System.out.print("\t\t\t=>How many Windows-8-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_8);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-10\t");
						System.out.print("\t\t\t=>How many Windows-10-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_10);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Windows-11\t");
						System.out.print("\t\t\t=>How many Windows-11-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.windows_11);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code2 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Virus Guards\t");
						System.out.print("\t\t\t=>How many Virus Guards-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.virus_gurd);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
						
				}else if(CD_code == 3) {
					
					cdDetails.DisplayMoviesandCartoonsCD();;
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Movies or Cartoon CD Type  you need to Purchase ? ");
					int CD_code3 = input.nextInt();
					
					if(CD_code3 == 1) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Bat-Man-Dark Knight");
						System.out.print("\t\t\t=>How many Bat-Man-Dark Knight-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.batman_DarkKnight);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
					}else if(CD_code3 == 2) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Spider-Man-HomeComing");
						System.out.print("\t\t\t=>How many Spider-Man-HomeComing-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Spiderman_homecoming);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 3) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Burn Cycle");
						System.out.print("\t\t\t=>How many Burn Cycle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.BurnCycle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 4) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Dark Castle");
						System.out.print("\t\t\t=>How many Dark Castle-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.DarkCastle);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else if(CD_code3 == 5) {
						CDModel  cdmodel = new CDModel();
						
						
						cdmodel.setName("Earth Command");
						System.out.print("\t\t\t=>How many Earth Command-Game-CD do you need to purchase ?");
						int Qty = input.nextInt();
						cdmodel.setQty(Qty);
						CDSubtotal = cdDetails.calculateBill(Qty, cdDetails.Earth_Command);
						double calculateamount = (double)CDSubtotal;
						cdmodel.setSubTotal(calculateamount);
						CDList.add(cdmodel);
						
						
						totalAmount += CDSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
				System.out.println();
				System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
				System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
				CD_desision = input.next();
					
				
			}while(CD_desision.equals("Y"));
					System.out.println();
					System.out.println();
					System.out.println("\t\t\t\tCD Service Bill Amount : ");
					System.out.println();
					System.out.println("\t\t\t\t_____________________________________________________");
					System.out.println("\t\t\t\tCDType\t\t\tQuantity\t Amount");
					System.out.println("\t\t\t\t_____________________________________________________");
					System.out.println();
		
					for(CDModel cdmodel : CDList) {
						
							System.out.print("\t\t\t\t"+cdmodel.getName());
						
							System.out.print("\t\t"+cdmodel.getQty());
						
							System.out.print("\t\t "+cdmodel.getSubTotal());
							
							System.out.println();
							
					}
		
					System.out.println();
					System.out.println("\t\t\t\t_____________________________________________________");
					System.out.println("\t\t\t\t\t\t\t\tSubTotal is : "+(double)totalAmount);
					System.out.println("\t\t\t\t_____________________________________________________");
					System.out.println();
		
					Services[2] = totalAmount;
		
		
	}
	
	public static void GraphicService(Graphic graphic) {
		
		Scanner input = new Scanner(System.in);
		if(Services[3] != 0) {
			totalAmount = Services[3];
		}else {
			totalAmount = 0;
		}
		
		do {
			graphic.displayGraphic();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Graphic Type  you need to Purchase ? ");
			int Graphic_code = input.nextInt();
			
				if(Graphic_code == 1) {
					graphic.displayflayerdesign();;
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Photo editing  you need to Purchase ? ");
					int Graphic_code1 = input.nextInt();
					
					if(Graphic_code1 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("flayer - high graphics");
						System.out.print("\t\t\t=>How many flayer - high graphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.photo_editing_high_grapics_flayer);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code1 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("flayer - simple graphics");
						System.out.print("\t\t\t=>How many flayer - simple graphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.photo_editing_simple_grapics_flayer);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code1 == 3) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("flayer - text edit graphics");
						System.out.print("\t\t\t=>How many flayer - text edit graphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.photo_editing_text_edit_flayer);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
					
				}else if(Graphic_code == 2) {
					
					graphic.displaystudiograpicdesign();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Photo editing  you need to Purchase ? ");
					int Graphic_code2 = input.nextInt();
					
					if(Graphic_code2 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("photo editing with re-touching");
						System.out.print("\t\t\t=>How many photo editing with re-touching do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.photo_editing_re_touching_studio_grapics);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code2 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("photo editing with changing background");
						System.out.print("\t\t\t=>How many photo editing with changing background do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.photo_editing_background_change);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
				  
						
				    
						
				}else if(Graphic_code == 3) {
					
					
					graphic.displayvideoediting();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Video editing  you need to Purchase ? ");
					int Graphic_code3 = input.nextInt();
					
					if(Graphic_code3 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("video editing with motion graphics");
						System.out.print("\t\t\t=>How many video editing with motion graphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.video_editing_motion_grapics);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code3 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("video editing with simple graphics");
						System.out.print("\t\t\t=>How many video editing with simple graphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.video_editing_simple_grapics);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
					
				}else if(Graphic_code == 4) {
					
					graphic.displayLogodesign();;
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of Logo design  you need to Purchase ? ");
					int Graphic_code4 = input.nextInt();
					
					if(Graphic_code4 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Logo Design - 2D\t");
						System.out.print("\t\t\t=>How many Logo Design - 2D do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.logo_design_per_logo_2d);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code4 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Logo Design - 3D\t");
						System.out.print("\t\t\t=>How many Logo Design - 3D do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.logo_design_per_logo_3d);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code4 == 3) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Logo Design - simple grphics\t");
						System.out.print("\t\t\t=>How many Logo Design - simple grphics do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.logo_design_per_logo_simple_animation);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
					
				}else if(Graphic_code == 5) {
					
					graphic.display2DAnimation();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of 2D animation video  you need to Purchase ? ");
					int Graphic_code5 = input.nextInt();
					
					if(Graphic_code5 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 2D - 2 minute");
						System.out.print("\t\t\t=>How many Animation Video - 2D - 2 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_2D_2_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code5 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 2D - 4 minute");
						System.out.print("\t\t\t=>How many Animation Video - 2D - 4 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_2D_4_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code5 == 3) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 2D - 8 minute");
						System.out.print("\t\t\t=>How many Animation Video - 2D - 8 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_2D_8_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code5 == 4) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 2D - 10 minute");
						System.out.print("\t\t\t=>How many Animation Video - 2D - 10 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_2D_10_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
					
				}else if(Graphic_code == 6) {
					
					graphic.display3DAnimation();
					System.out.println();
					System.out.println();
					System.out.print("\t\t\t=>Enter the code of 3D animation  video  you need to Purchase ? ");
					int Graphic_code6 = input.nextInt();
					
					if(Graphic_code6 == 1) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 3D - 2 minute");
						System.out.print("\t\t\t=>How many Animation Video - 3D - 2 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_3D_2_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
					}else if(Graphic_code6 == 2) {
						GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 3D - 4 minute");
						System.out.print("\t\t\t=>How many Animation Video - 3D - 4 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_3D_4_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code6 == 3) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 3D - 8 minute");
						System.out.print("\t\t\t=>How many Animation Video - 3D - 8 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_3D_8_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    }else if(Graphic_code6 == 4) {
				    	GraphicModel graphicmodel = new GraphicModel();
						
						
						graphicmodel.setName("Animation Video - 3D - 10 minute");
						System.out.print("\t\t\t=>How many Animation Video - 3D - 10 minute do you need to purchase ?");
						int Qty = input.nextInt();
						graphicmodel.setQty(Qty);
						GraphicSubtotal = graphic.calculateBill(Qty, graphic.animation_video_3D_10_minute);
						double calculateamount = (double)GraphicSubtotal;
						graphicmodel.setSubTotal(calculateamount);
						GraphicList.add(graphicmodel);
						
						
						totalAmount += GraphicSubtotal;
						
				    
						
				    }else {
						   System.out.println("\t\t\t=>Please enter a valied code ....");
					}
					
					
				}else {
					   System.out.println("\t\t\t=>Please enter a valied code ....");
				}
				
				System.out.println();
				System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
				System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
				Graphic_desision = input.next();
					
				
			}while(Graphic_desision.equals("Y"));
					System.out.println();
					System.out.println();
					System.out.println("\t\t\t\tGraphic Service Bill Amount : ");
					System.out.println();
					System.out.println("\t\t\t\t_____________________________________________________________________");
					System.out.println("\t\t\t\tGraphicType\t\t\t\tQuantity\t\tAmount");
					System.out.println("\t\t\t\t_____________________________________________________________________");
					System.out.println();
		
					for(GraphicModel graphicmodel :  GraphicList) {
						
							System.out.print("\t\t\t\t"+ graphicmodel.getName());
						
							System.out.print("\t\t"+ graphicmodel.getQty());
						
							System.out.print("\t\t"+ graphicmodel.getSubTotal());
							
							System.out.println();
							
					}
		
					System.out.println();
					System.out.println("\t\t\t\t_____________________________________________________________________");
					System.out.println("\t\t\t\t\t\t\t\t\t\tSubtotal is : "+(double)totalAmount);
					System.out.println("\t\t\t\t_____________________________________________________________________");
					System.out.println();
		
					Services[3] = totalAmount;
		
		
		
	}
	
	public static void PrintService(Print print) {
		
		Scanner input = new Scanner(System.in);
		if(Services[4] != 0) {
			totalAmount = Services[4];
		}else {
			totalAmount = 0;
		}
		
		do {
			print.DisplayPrint();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Print Type  you need to Purchase ? ");
			int Print_code = input.nextInt();
			
			
			if(Print_code == 1) {
				
				PrintModel printmodel = new PrintModel();
				
				
				printmodel.setName("Black and White Single Side-print");
				System.out.print("\t\t\t=>How many Black and White Single Side do you need to purchase ?");
				int Qty = input.nextInt();
				printmodel.setQty(Qty);
				PrintSubtotal = print.calculateBill(Qty, print.blackAndWhite_SingleSide);
				double calculateamount = (double)PrintSubtotal;
				printmodel.setSubTotal(calculateamount);
				PrintedList.add(printmodel);
				totalAmount += PrintSubtotal;
				
			}else if(Print_code == 2) {
				
				PrintModel printmodel = new PrintModel();
				
				
				printmodel.setName("Black and White Double Side-print");
				System.out.print("\t\t\t=>How many Black and White Double Side do you need to purchase ?");
				int Qty = input.nextInt();
				printmodel.setQty(Qty);
				PrintSubtotal = print.calculateBill(Qty, print.blackAndWhite_DoubleSide);
				double calculateamount = (double)PrintSubtotal;
				printmodel.setSubTotal(calculateamount);
				PrintedList.add(printmodel);
				totalAmount += PrintSubtotal;
				
			}else if(Print_code == 3) {
				
				PrintModel printmodel = new PrintModel();
				
				
				printmodel.setName("Color Single Side-print");
				System.out.print("\t\t\t=>How many Color Single Side do you need to purchase ?");
				int Qty = input.nextInt();
				printmodel.setQty(Qty);
				PrintSubtotal = print.calculateBill(Qty, print.Color_SingleSide);
				double calculateamount = (double)PrintSubtotal;
				printmodel.setSubTotal(calculateamount);
				PrintedList.add(printmodel);
				totalAmount += PrintSubtotal;
				
			}else if(Print_code == 4) {
				
				PrintModel printmodel = new PrintModel();
				
				
				printmodel.setName("Color Double Side-print");
				System.out.print("\t\t\t=>How many Color Double Side do you need to purchase ?");
				int Qty = input.nextInt();
				printmodel.setQty(Qty);
				PrintSubtotal = print.calculateBill(Qty, print.Color_DoubleSide);
				double calculateamount = (double)PrintSubtotal;
				printmodel.setSubTotal(calculateamount);
				PrintedList.add(printmodel);
				totalAmount += PrintSubtotal;
				
			}else {
				   System.out.println("\t\t\t=>Please enter a valied code ....");
			}
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			Print_desision = input.next();
			
			
		}while(Print_desision.equals("Y"));
			System.out.println();
			System.out.println();
			System.out.println("\t\t\t\tPrint Service Bill Amount : ");
			System.out.println();
			System.out.println("\t\t\t\t_______________________________________________________________________");
			System.out.println("\t\t\t\tPrintType\t\t\t\tQuantity \t\tAmount");
			System.out.println("\t\t\t\t_______________________________________________________________________");
			System.out.println();

			for(PrintModel printmodel :  PrintedList) {
					String x = printmodel.getName();
				
				System.out.print("\t\t\t\t"+ printmodel.getName());
				
				
			
					System.out.print("\t\t\t"+ printmodel.getQty());
			
			
				
			
				System.out.print("\t\t\t"+ printmodel.getSubTotal());
				
				System.out.println();
				
			}

			System.out.println();
			System.out.println("\t\t\t\t_______________________________________________________________________");
			System.out.println("\t\t\t\t\t\t\t\t\t\tSubtotal is : "+(double)totalAmount);
			System.out.println("\t\t\t\t_______________________________________________________________________");
			System.out.println();

			Services[4] = totalAmount;
	}
	
	
	public static void PhotoCopyService(PhotoCopy photocopy) {
		Scanner input = new Scanner(System.in);
		if(Services[5] != 0) {
			totalAmount = Services[5];
		}else {
			totalAmount = 0;
		}
		
		do {
			photocopy.DisplayPhotoCopy();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Photocopy Type  you need to Purchase ? ");
			int Photocopy_code = input.nextInt();
			
			
			if(Photocopy_code == 1) {
				
				PhotoCopyModel photocopymodel = new PhotoCopyModel();
				
				
				photocopymodel.setName( "Black and White Single Side - PhotoCopy");
				System.out.print("\t\t\t=>How many  Black and White Single Side - PhotoCopy do you need to purchase ?");
				int Qty = input.nextInt();
				photocopymodel.setQty(Qty);
				PhotocopySubtotal = photocopy.calculateBill(Qty, photocopy.blackAndWhite_SingleSide);
				double calculateamount = (double)PhotocopySubtotal;
				photocopymodel.setSubTotal(calculateamount);
				photocopylist.add(photocopymodel);
				totalAmount += PhotocopySubtotal;
				
			}else if(Photocopy_code == 2) {
				
				PhotoCopyModel photocopymodel = new PhotoCopyModel();
				
				
				photocopymodel.setName( "Black and White Double Side - PhotoCopy");
				System.out.print("\t\t\t=>How many  Black and White Double Side - PhotoCopy  do you need to purchase ?");
				int Qty = input.nextInt();
				photocopymodel.setQty(Qty);
				PhotocopySubtotal = photocopy.calculateBill(Qty, photocopy.blackAndWhite_DoubleSide);
				double calculateamount = (double)PhotocopySubtotal;
				photocopymodel.setSubTotal(calculateamount);
				photocopylist.add(photocopymodel);
				totalAmount += PhotocopySubtotal;
				
			}else if(Photocopy_code == 3) {
				
				PhotoCopyModel photocopymodel = new PhotoCopyModel();
				
				
				photocopymodel.setName( "Color Single Side - PhotoCopy         ");
				System.out.print("\t\t\t=>How many  Color Single Side - PhotoCopy do you need to purchase ?");
				int Qty = input.nextInt();
				photocopymodel.setQty(Qty);
				PhotocopySubtotal = photocopy.calculateBill(Qty, photocopy.Color_SingleSide);
				double calculateamount = (double)PhotocopySubtotal;
				photocopymodel.setSubTotal(calculateamount);
				photocopylist.add(photocopymodel);
				totalAmount += PhotocopySubtotal;
				
			}else if(Photocopy_code == 4) {
				PhotoCopyModel photocopymodel = new PhotoCopyModel();
				
				
				photocopymodel.setName( "Color Double Side - PhotoCopy           ");
				System.out.print("\t\t\t=>How many  Color Double Side - PhotoCopy do you need to purchase ?");
				int Qty = input.nextInt();
				photocopymodel.setQty(Qty);
				PhotocopySubtotal = photocopy.calculateBill(Qty, photocopy.Color_DoubleSide);
				double calculateamount = (double)PhotocopySubtotal;
				photocopymodel.setSubTotal(calculateamount);
				photocopylist.add(photocopymodel);
				totalAmount += PhotocopySubtotal;
				
				
			}else {
				   System.out.println("\t\t\t=>Please enter a valied code ....");
			}
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t=>Do you need to perchse more items ? [Y/N] ");
			PhotoCopy_desision = input.next();
			
			
		}while(PhotoCopy_desision.equals("Y"));
		
			System.out.println();
			System.out.println();
			
			System.out.println("\t\t\t\tPhotoCopy Service Bill Amount : ");
			System.out.println();
			System.out.println("\t\t\t\t___________________________________________________________________________");
			System.out.println("\t\t\t\tPhotoCopyType\t\t\t\tQuantity\t\t   Amount");
			System.out.println("\t\t\t\t___________________________________________________________________________");
			System.out.println();

			for(PhotoCopyModel  photocopymodel : photocopylist) {
			
				System.out.print("\t\t\t\t"+ photocopymodel.getName());
			
				System.out.print("\t\t"+ photocopymodel.getQty());
			
				System.out.print("\t\t\t"+ photocopymodel.getSubTotal());
				
				System.out.println();
				
			}

			System.out.println();
			System.out.println("\t\t\t\t___________________________________________________________________________");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t Subtotal is : "+(double)totalAmount);
			System.out.println("\t\t\t\t___________________________________________________________________________");
			System.out.println();

			Services[5] = totalAmount;
		
	}
	
	public static void ScannerService(ScannerI scanner) {
				
		Scanner input = new Scanner(System.in);
		if(Services[6] != 0) {
			totalAmount = Services[6];
		}else {
			totalAmount = 0;
		}
		
		do {
			scanner.DisplayScanner();
			System.out.println();
			System.out.println();
			System.out.print("\t\t\t=>Enter the code of Scanner Type  you need to Purchase ? ");
			int Scanner_code = input.nextInt();
			
			
			if(Scanner_code  == 1) {
				
			    ScannerModel scannermodel = new ScannerModel();
				
				
				scannermodel.setName(" Scanner - Single Side ");
				System.out.print("\t\t\t=>How many  Scanner - Single Side do you need to purchase ?");
				int Qty = input.nextInt();
				scannermodel.setQty(Qty);
				ScannerSubtotal = scanner.calculateBill(Qty, scanner.Scanner_SingleSide);
				double calculateamount = (double)ScannerSubtotal;
				scannermodel.setSubTotal(calculateamount);
				scannerlist.add(scannermodel);
				totalAmount += ScannerSubtotal;
				
			}else if(Scanner_code  == 2) {
				
				  	ScannerModel scannermodel = new ScannerModel();
					
					
					scannermodel.setName(" Scanner - Double Side ");
					System.out.print("\t\t\t=>How many  Scanner - Double Side do you need to purchase ?");
					int Qty = input.nextInt();
					scannermodel.setQty(Qty);
					ScannerSubtotal = scanner.calculateBill(Qty, scanner.Scanner_DoubleSide);
					double calculateamount = (double)ScannerSubtotal;
					scannermodel.setSubTotal(calculateamount);
					scannerlist.add(scannermodel);
					totalAmount += ScannerSubtotal;
				
			}else {
				   System.out.println("\t\t\t=>Please enter a valied code ....");
			}
			
			System.out.println();
			System.out.println("\t\t\t  *** Please enter [Y] if 'yes' and [N] if 'No' ***");
			System.out.print("\t\t\t\tDo you need to perchse more items ? [Y/N] ");
			Scanner_desision = input.next();
			
			
		}while(Scanner_desision.equals("Y"));
			System.out.println();
			System.out.println();
		
			System.out.println("\t\t\t\tScanner Service Bill Amount : ");
			System.out.println();
			System.out.println("\t\t\t\t______________________________________________________________________");
			System.out.println("\t\t\t\tScannerType\t\t    Quantity\t\t\t Amount");
			System.out.println("\t\t\t\t______________________________________________________________________");
			System.out.println();

			for(ScannerModel  scannermodel : scannerlist) {
			
				System.out.print("\t\t\t\t"+ scannermodel.getName());
			
				System.out.print("\t\t"+ scannermodel.getQty());
			
				System.out.print("\t\t\t"+  scannermodel.getSubTotal());
				
				System.out.println();
				
			}

			System.out.println();
			System.out.println("\t\t\t\t______________________________________________________________________");
			System.out.println("\t\t\t\t\t\t\t\t\t\t Subtotal is : "+(double)totalAmount);
			System.out.println("\t\t\t\t______________________________________________________________________");
			System.out.println();

			Services[6] = totalAmount;
	}
	
				public static void displaytotalbill() {
					System.out.println();
					System.out.println();
				
					System.out.println("\t\t\t\tTotal Bill for The Services Used By The Customer : ");
					System.out.println();
					System.out.println("\t\t\t\t______________________________________________________________________");
					System.out.println("\t\t\t\tService\t\t\t    Total Amount\t\t\t ");
					System.out.println("\t\t\t\t______________________________________________________________________");
					System.out.println();
					double tot = 0;
					
					for(int i = 0 ; i<7 ; i++ ) {
						if(i==0) {
							System.out.println("\t\t\t\t Stationary Service\t\t"+"RS."+Services[i]+".00");
						}else if(i==1) {
							System.out.println("\t\t\t\t Reload Service\t\t\t"+"RS."+Services[i]+".00");
						}else if(i==2) {
							System.out.println("\t\t\t\t CD Service\t\t\t"+"RS."+Services[i]+".00");
						}else if(i==3) {
							System.out.println("\t\t\t\t Graphic Service\t\t"+"RS."+Services[i]+".00");
						}else if(i==4) {
							System.out.println("\t\t\t\t Printing Service\t\t"+"RS."+Services[i]+".00");
						}else if(i==5) {
							System.out.println("\t\t\t\t PhotoCopy Service \t\t"+"RS."+Services[i]+".00");
						}else if(i==6) {
							System.out.println("\t\t\t\t Scanning Service\t\t"+"RS."+Services[i]+".00");
						}
						tot += Services[i];
					}
					
					
				
					
					
					
					
					

					System.out.println();
					System.out.println("\t\t\t\t______________________________________________________________________");
					System.out.println("\t\t\t\t\t\t\t\t\t\t Total Bill is : "+tot);
					System.out.println("\t\t\t\t______________________________________________________________________");
					System.out.println();
				}
	
	
	}

