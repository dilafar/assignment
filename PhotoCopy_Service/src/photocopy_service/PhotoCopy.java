package photocopy_service;

public interface PhotoCopy {
	
	public int blackAndWhite_SingleSide = 10;
	public int blackAndWhite_DoubleSide = 20;
	public int Color_SingleSide = 15;
	public int Color_DoubleSide = 30;
	
	
	public void DisplayPhotoCopy();
	public int calculateBill(int qty , int price);

}
