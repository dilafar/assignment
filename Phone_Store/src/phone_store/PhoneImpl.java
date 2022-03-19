package phone_store;



public class PhoneImpl implements Phone{

	@Override
	public void Display_Iphone() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tiphone X \t"+Phone.iphoneX);
		System.out.println("\t\t\t\t2\tiphone 11\t"+Phone.iphone11);
		System.out.println("\t\t\t\t3\tiphone 12\t"+Phone.iphone12);
		System.out.println("\t\t\t\t4\tiphone XS Max\t\t"+Phone.iphone_XS_Max);
		
		
		System.out.println("\t\t\t\t________________________________________");
		
		
	}

	@Override
	public void Display_Sumsung() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tHuawei Y7 \t"+Phone.Huawei_Y7);
		System.out.println("\t\t\t\t2\tHuawei p50\t"+Phone.Huawei_p50);
		System.out.println("\t\t\t\t3\tHuawei p30_pro\t"+Phone.Huawei_p30_pro);
	
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public void Display_Huawei() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem\t\tPrice");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tSumsung s22\t"+Phone.Sumsung_s22);
		System.out.println("\t\t\t\t2\tSumsung s21\t"+Phone.Sumsung_s21);
		System.out.println("\t\t\t\t3\tSumsung s20\t"+Phone.Sumsung_s20);
		System.out.println("\t\t\t\t4\tSumsung s10\t"+Phone.Sumsung_s10);
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

	@Override
	public int calculateBill(int qty, int price) {
		int sub = qty * price;
		return sub;
	}

	@Override
	public void DisplayPhone() {
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\tcode\tItem");
		System.out.println("\t\t\t\t________________________________________");
		System.out.println("\t\t\t\t1\tIphone \t");
		System.out.println("\t\t\t\t2\tHuawei\t");
		System.out.println("\t\t\t\t3\tSumsung\t");
		
		
		
		System.out.println("\t\t\t\t________________________________________");
		
	}

}
