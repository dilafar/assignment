package labtop_repairing_service;



public class Laptop_RepairingImpl implements Labtop_Repairing {

	@Override
	public void Display_Laptop_Repairing() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tchange_harddrive\t"+Labtop_Repairing.change_harddrive);
		System.out.println("\t\t\t\t2\tram_upgrade\t\t"+Labtop_Repairing.ram_upgrade);
		System.out.println("\t\t\t\t3\tkeyboard_change\t\t"+Labtop_Repairing.keyboard_change);
		System.out.println("\t\t\t\t4\tsoftware_update\t\t"+Labtop_Repairing.software_update);
		System.out.println("\t\t\t\t5\tmouse_pad\t\t"+Labtop_Repairing.mouse_pad);
		System.out.println("\t\t\t\t6\tdisplay_change\t\t"+Labtop_Repairing.display_change);
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}
	

}
