package scanner_service;



public class ScannerImpl implements ScannerI{

	@Override
	public void DisplayScanner() {
		System.out.println("\t\t\t\t__________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t   Price");
		System.out.println("\t\t\t\t__________________________________________");
		System.out.println("\t\t\t\t1\t Scanner - Single Side \t   "+ ScannerI.Scanner_DoubleSide);
		System.out.println("\t\t\t\t2\t Scanner - Double Side\t   "+ ScannerI.Scanner_DoubleSide);
		System.out.println("\t\t\t\t__________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
