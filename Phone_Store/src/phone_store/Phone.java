package phone_store;

public interface Phone {
		public int iphoneX = 30000;
		public int iphone11 = 40000;
		public int iphone12 = 50000;
		public int iphone_XS_Max = 60000;
		
		public int Huawei_Y7 =  30000;
		public int Huawei_p50 = 35000;
		public int Huawei_p30_pro = 50000;
		
		public int Sumsung_s22 = 40000;
		public int Sumsung_s21 = 30000;
		public int Sumsung_s20 = 25000;
		public int Sumsung_s10 = 50000;
		
		public void DisplayPhone();
		public void Display_Iphone();
		public void Display_Sumsung();
		public void Display_Huawei();
		public int calculateBill(int qty , int price);
		
		
}
