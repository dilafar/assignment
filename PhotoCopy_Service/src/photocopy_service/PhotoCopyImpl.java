package photocopy_service;



public class PhotoCopyImpl implements PhotoCopy{

	@Override
	public void DisplayPhotoCopy() {
		System.out.println("\t\t\t\t______________________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t______________________________________________________________");
		System.out.println("\t\t\t\t1\t Black and White Single Side - PhotoCopy \t"+PhotoCopy.blackAndWhite_SingleSide);
		System.out.println("\t\t\t\t2\t Black and White Double Side - PhotoCopy\t"+PhotoCopy.blackAndWhite_DoubleSide);
		System.out.println("\t\t\t\t3\t Color Single Side - PhotoCopy\t\t\t"+ PhotoCopy.Color_SingleSide);
		System.out.println("\t\t\t\t4\t Color Double Side - PhotoCopy\t\t\t"+ PhotoCopy.Color_DoubleSide);
		System.out.println("\t\t\t\t_______________________________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
