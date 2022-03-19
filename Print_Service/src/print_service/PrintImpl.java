package print_service;



public class PrintImpl implements Print{

	@Override
	public void DisplayPrint() {
		System.out.println("\t\t\t\t______________________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\t\t\tPrice");
		System.out.println("\t\t\t\t______________________________________________________");
		System.out.println("\t\t\t\t1\t Black and White Single Side - Print \t"+Print.blackAndWhite_SingleSide);
		System.out.println("\t\t\t\t2\t Black and White Double Side - Print\t"+Print.blackAndWhite_DoubleSide);
		System.out.println("\t\t\t\t3\t Color Single Side - print\t\t"+ Print.Color_SingleSide);
		System.out.println("\t\t\t\t4\t Color Double Side - print\t\t"+ Print.Color_DoubleSide);
		System.out.println("\t\t\t\t______________________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
