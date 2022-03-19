package com.mtit.stationary_service;

public class StationaryImpl implements Stationary{

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

	@Override
	public void DisplayStationeries() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tA4Paper-White\t"+Stationary.A4paper_white);
		System.out.println("\t\t\t\t2\tA4Paper-Color\t"+Stationary.A4paper_color);
		System.out.println("\t\t\t\t3\tScissores\t"+Stationary.Scisores);
		System.out.println("\t\t\t\t4\tPencil\t\t"+Stationary.Pencil);
		System.out.println("\t\t\t\t5\tErasor\t\t"+Stationary.Erasor);
		System.out.println("\t\t\t\t6\tSingleRule-Books enter the code");
		System.out.println("\t\t\t\t7\tSqureRule-Books\t enter the code");
		System.out.println("\t\t\t\t8\tNoteBook\t enter the code");
		System.out.println("\t\t\t\t9\tPens\t\t enter the code");
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public void DisplayExerciseBookSingleRule() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tExerciseBook-80Page\t"+Stationary.ExerciseBook_80Page);
		System.out.println("\t\t\t\t2\tExerciseBook-120Page\t"+Stationary.ExerciseBook_120Page);
		System.out.println("\t\t\t\t3\tExerciseBook-160Page\t"+Stationary.ExerciseBook_160Page);
		System.out.println("\t\t\t\t4\tExerciseBook-200Page\t"+Stationary.ExerciseBook_200Page);
		System.out.println("\t\t\t\t5\tExerciseBook-240Page\t"+Stationary.ExerciseBook_240Page);
		System.out.println("\t\t\t\t6\tCRBook-80Page\t\t"+Stationary.CRBook_80page);
		System.out.println("\t\t\t\t7\tCRBook-120Page\t\t"+Stationary.CRBook_120page);
		System.out.println("\t\t\t\t8\tCRBook-160Page\t\t"+Stationary.CRBook_160page);
		System.out.println("\t\t\t\t9\tCRBook-200Page\t\t"+Stationary.CRBook_200page);
		System.out.println("\t\t\t\t10\tCRBook-240Page\t\t"+Stationary.CRBook_240page);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void DisplayExerciseBookSqureRule() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tExerciseBook-80Page\t"+Stationary.ExerciseBook_80Page);
		System.out.println("\t\t\t\t2\tExerciseBook-120Page\t"+Stationary.ExerciseBook_120Page);
		System.out.println("\t\t\t\t3\tExerciseBook-160Page\t"+Stationary.ExerciseBook_160Page);
		System.out.println("\t\t\t\t4\tExerciseBook-200Page\t"+Stationary.ExerciseBook_200Page);
		System.out.println("\t\t\t\t5\tExerciseBook-240Page\t"+Stationary.ExerciseBook_240Page);
		System.out.println("\t\t\t\t6\tCRBook-80Page\t\t"+Stationary.CRBook_80page);
		System.out.println("\t\t\t\t7\tCRBook-120Page\t\t"+Stationary.CRBook_120page);
		System.out.println("\t\t\t\t8\tCRBook-160Page\t\t"+Stationary.CRBook_160page);
		System.out.println("\t\t\t\t9\tCRBook-200Page\t\t"+Stationary.CRBook_200page);
		System.out.println("\t\t\t\t10\tCRBook-240Page\t\t"+Stationary.CRBook_240page);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void NoteBook() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tNoteBook-40Page\t\t"+Stationary.NoteBook_40page);
		System.out.println("\t\t\t\t2\tNoteBook-80Page\t\t"+Stationary.NoteBook_80page);
		System.out.println("\t\t\t\t3\tNoteBook-120Page\t"+Stationary.NoteBook_120page);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void AtlesPen() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tBollPoint-Pen-Atlas\t"+Stationary.Pen_Atlas_Bollpoint);
		System.out.println("\t\t\t\t2\tButterGel-Pen-Atlas\t"+Stationary.Pen_Atlas_ButterGel);
		System.out.println("\t\t\t\t3\tGel-Atlas\t\t"+Stationary.Pen_Atlas_Gell);
		System.out.println("\t\t\t\t4\tBollPoint-Pen-Linc\t"+Stationary.Pen_linc_Bollpoint);
		System.out.println("\t\t\t\t5\tGel-Linc\t\t"+Stationary.Pen_linc_Gel);
		System.out.println("\t\t\t\t6\tBollPoint-Pen-Ten\t"+Stationary.Pen_Ten_Bollpoint);
		System.out.println("\t\t\t\t7\tGel-Ten\t\t\t"+Stationary.Pen_Ten_Gel);
		System.out.println("\t\t\t\t________________________________________");
	}

	
}
