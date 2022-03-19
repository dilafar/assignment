package phone_repairing_service;

public interface Phone_Repairing {
	
			public int display_replacement = 40000;
			public int bettery_replacement = 1000;
			public int speaker_replacement = 600;
			public int software_change = 4000;
			public int tempt_glass = 300;
			
			public void Display_Phone_Repairing();
			public int calculateBill(int qty , int price);
}
