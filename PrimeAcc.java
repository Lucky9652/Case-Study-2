package com.shopping;


	public abstract class PrimeAcc extends ShopAcc{//Step 5
		private boolean isPrime;
		private float deliverCharges;

		public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
		{
			super(accNo, accNm, charges);
			// TODO Auto-generated constructor stub
			this.isPrime=isPrime;
		}
		@Override//Step 6
		public void Bookproduct() { 
			System.out.println("Product booked with charges : +charges");
			}
		@Override//Step 7
		public String toString() {
			String accNm="KARTHIK MUNIKRISHNA";
			System.out.println(accNm.toString());
			return accNm;
	}
		}


