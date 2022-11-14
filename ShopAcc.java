package com.shopping;

public abstract class ShopAcc{//step 1
		private int accNo;
		private String accNm;
		private static float charges;
		
		
		public ShopAcc(int accNo,String accNm,float charges) {//step 2
			super();
			System.out.println(accNo+"   "+accNm+" "+" "+charges);
			this.accNo=accNo;
			this.accNm=accNm;
			this.charges=charges;
			}
		public void Bookproduct(float charges) {
			// TODO Auto-generated method stub
			
		}
		public void Bookproduct() {//step 3
		}
		public abstract void Bookproduct1(float charges);
		public void items(String items) {
			System.out.println("Item delever with charges " + items);
			}
		public String toString() {//Step 4
			return accNm;
			}
	}


