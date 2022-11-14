package com.shopping;


public  class NormalAcc extends ShopAcc{//Step 8
		private float deliveryCharges=200;

		public NormalAcc(int accNo, String accNm, float charges) {
			super(accNo, accNm, charges);
			// TODO Auto-generated constructor stub
			this.setDeliveryCharges(deliveryCharges);
		}
		
		
		private void setDeliveryCharges(float deliveryCharges2) {
			// TODO Auto-generated method stub
			
		}


		@Override //Step 9
		public void Bookproduct(float charges) 
		
		{
			System.out.println("Product booked with charges : " + charges);
		}
		@Override//Step 10
		public String toString() {
			String accNm="Venkatesh Munikrishna";
			System.out.println(accNm.toString());
			return accNm;
		}
		@Override
		public void Bookproduct1(float charges) {
			// TODO Auto-generated method stub
			
		}
		
	}


