package com.shopping;

 class GSNormalAcc extends NormalAcc{//Step 14
		private static  float charges;
		private int accNo;
		private String accNm;
		private float deliveryCharges;
		
		public GSNormalAcc(int accNo, String accNm, float charges) {
			super(accNo,accNm,charges);
			// TODO Auto-generated constructor stub
			System.out.println("IT IS A GSNormalAcc");
			System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " DELIVERYCHARGES:"+deliveryCharges+"");
		}
		@Override
		public void Bookproduct(float charges) {
			System.out.println("product booked with charges : " +charges);
		}
		@Override
		public String toString() {
			String accNm="NETHRA NISHA";
			System.out.println(accNm.toString());
			System.out.println("===================================================");
			return accNm;
		}
		public static float getCharges() {
			return charges;
		}
		public static void setCharges(float charges) {
			GSNormalAcc.charges = charges;
		}
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getAccNm() {
			return accNm;
		}
		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}

}
