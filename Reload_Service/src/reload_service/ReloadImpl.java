package reload_service;



public class ReloadImpl implements Reload{

	@Override
	public void DisplayReloadCards() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\t\tItem");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\t\tDialog\t");
		System.out.println("\t\t\t\t2\t\tHutch\t");
		System.out.println("\t\t\t\t3\t\tMobitel\t");
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void DisplayDialogCards() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\t\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tDialog-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("\t\t\t\t2\tDialog-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("\t\t\t\t3\tDialog-DataCard-49\t"+Reload.reload_49);
		System.out.println("\t\t\t\t4\tDialog-DataCard-99\t"+Reload.reload_99);
		System.out.println("\t\t\t\t5\tDialog-DataCard-199\t"+Reload.reload_199);
		System.out.println("\t\t\t\t6\tDialog-DataCard-249\t"+Reload.reload_249);
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public void DisplayHutchCards() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\t\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tHutch-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("\t\t\t\t2\tHutch-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("\t\t\t\t3\tHutch-DataCard-48\t"+Reload.reload_49);
		System.out.println("\t\t\t\t4\tHutch-DataCard-99\t"+Reload.reload_99);
		System.out.println("\t\t\t\t5\tHutch-DataCard-198\t"+Reload.reload_199);
		System.out.println("\t\t\t\t6\tHutch-DataCard-649\t"+Reload.reload_249);
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public void DisplayMobitelCards() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\t\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tMobitel-ReloadCard-50\t"+Reload.reload_50);
		System.out.println("\t\t\t\t2\tMobitel-ReloadCard-100\t"+Reload.reload_100);
		System.out.println("\t\t\t\t3\tMobitel-DataCard-49\t"+Reload.reload_49);
		System.out.println("\t\t\t\t4\tMobitel-DataCard-99\t"+Reload.reload_99);
		System.out.println("\t\t\t\t5\tMobitel-DataCard-199\t"+Reload.reload_199);
		System.out.println("\t\t\t\t6\tMobitel-DataCard-249\t"+Reload.reload_249);
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
