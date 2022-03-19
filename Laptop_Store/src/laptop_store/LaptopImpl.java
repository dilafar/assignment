package laptop_store;



public class LaptopImpl implements Laptop{

	@Override
	public void Display_Apple() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tMacbook Pro\t"+Laptop.Macbookpro);
		System.out.println("\t\t\t\t2\tMacbook Air\t"+Laptop.macbookair);
	
		
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void Display_Dell() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tDell latitute\t"+Laptop.Dell_latitute);
		System.out.println("\t\t\t\t2\tDell inspiron \t"+Laptop.Dell_inspiron);
		System.out.println("\t\t\t\t3\tDell alionware \t"+Laptop.Dell_alionware);
	
		
		
		
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public void Display_Asus() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tAsus rog\t"+Laptop.Asus_rog);
		System.out.println("\t\t\t\t2\tAsus vivobook \t"+Laptop.Asus_vivobook);
		System.out.println("\t\t\t\t3\tAsus notebook \t"+Laptop.Asus_notebook);
	
		
		
		
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

	@Override
	public void Display_Laptop() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tApple - laptop\t");
		System.out.println("\t\t\t\t2\tDell  - laptop\t");
		System.out.println("\t\t\t\t3\tAsus  - laptop\t");
	
		
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

}
