package laptop_store;

public interface Laptop {
	public int Macbookpro = 200000;
	public int macbookair = 300000;
	
	
	public int Dell_latitute =  30000;
	public int Dell_inspiron = 35000;
	public int Dell_alionware = 50000;
	
	public int Asus_rog = 40000;
	public int Asus_vivobook = 30000;
	public int Asus_notebook = 25000;

	public void Display_Laptop();
	public void Display_Apple();
	public void Display_Dell();
	public void Display_Asus();
	public int calculateBill(int qty , int price);
}
