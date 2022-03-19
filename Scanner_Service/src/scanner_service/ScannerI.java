package scanner_service;

public interface ScannerI {
		
	public int Scanner_SingleSide = 40;
	public int Scanner_DoubleSide = 50;
	
	
	
	public void DisplayScanner();
	public int calculateBill(int qty , int price);
}
