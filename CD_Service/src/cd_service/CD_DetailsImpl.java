package cd_service;



public class CD_DetailsImpl implements CD_Details{

	@Override
	public void DisplayCDDetails() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tGaming - CD\t");
		System.out.println("\t\t\t\t2\tSoftwareLicence - CD\t");
		System.out.println("\t\t\t\t3\tMovies & Cartoons - CD\t");
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void DisplayGamingCD() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tBattleShip\t"+CD_Details.Battle_Ship);
		System.out.println("\t\t\t\t2\tAxis and Allies\t"+CD_Details.AxisandAllies);
		System.out.println("\t\t\t\t3\tBurn Cycle\t"+CD_Details.BurnCycle);
		System.out.println("\t\t\t\t4\tDark Castle\t"+CD_Details.DarkCastle);
		System.out.println("\t\t\t\t5\tEarth Command\t"+CD_Details.Earth_Command);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void DisplaySoftwareLicenceCD() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tWindows-7\t"+CD_Details.windows_7);
		System.out.println("\t\t\t\t2\tWindows-8\t"+CD_Details.windows_8);
		System.out.println("\t\t\t\t3\tWindows-10\t"+CD_Details.windows_10);
		System.out.println("\t\t\t\t4\tWindows-11\t"+CD_Details.windows_11);
		System.out.println("\t\t\t\t5\tVirus Guards\t"+CD_Details.virus_gurd);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void DisplayMoviesandCartoonsCD() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tBat-Man-Dark Knight\t"+CD_Details.batman_DarkKnight);
		System.out.println("\t\t\t\t2\tSpider-Man-HomeComing\t"+CD_Details.Spiderman_homecoming);
		System.out.println("\t\t\t\t3\tIron-Man\t\t"+CD_Details.Iron_man);
		System.out.println("\t\t\t\t4\tAvengers-EndGame\t"+CD_Details.Avengers_Endgame);
		System.out.println("\t\t\t\t5\tBlack Panther\t\t"+CD_Details.Black_Panther);
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

}
