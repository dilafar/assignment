package labtop_repairing_service;

public interface Labtop_Repairing {
			public int change_harddrive = 15000;
			public int ram_upgrade = 8000;
			public int keyboard_change = 10000;
			public int software_update = 4000;
			public int mouse_pad = 2000;
			public int display_change = 18000;
		
			
			public void Display_Laptop_Repairing();
			public int calculateBill(int qty , int price);
}
