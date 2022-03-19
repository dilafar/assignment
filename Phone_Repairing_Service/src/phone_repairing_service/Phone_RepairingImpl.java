package phone_repairing_service;



public class Phone_RepairingImpl implements Phone_Repairing{

	@Override
	public void Display_Phone_Repairing() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tdisplay_replacement\t"+Phone_Repairing.display_replacement);
		System.out.println("\t\t\t\t2\tbettery_replacement\t"+Phone_Repairing.bettery_replacement);
		System.out.println("\t\t\t\t3\tspeaker_replacement\t"+Phone_Repairing.speaker_replacement);
		System.out.println("\t\t\t\t4\tsoftware_change\t\t"+Phone_Repairing.software_change);
		System.out.println("\t\t\t\t5\ttempt_glass\t\t"+Phone_Repairing.tempt_glass);
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}
	

}
