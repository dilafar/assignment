package print_service;

public interface Print{

	public int blackAndWhite_SingleSide = 20;
	public int blackAndWhite_DoubleSide = 30;
	public int Color_SingleSide = 40;
	public int Color_DoubleSide = 50;
	
	
	public void DisplayPrint();
	public int calculateBill(int qty , int price);
	
	
}
