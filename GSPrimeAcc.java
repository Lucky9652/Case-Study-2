package com.shopping;

 class GSPrimeAcc extends PrimeAcc{//step 11
		private static final float Charges =400;
		public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
			super(accNo, accNm, charges, isPrime);
			// TODO Auto-generated constructor stub
			System.out.println("THIS IS A GSPRIMEACC");
			System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " ISPRIME:" +isPrime);
		
			
		}
			@Override//Step 12
			public void Bookproduct(float charges) {
				System.out.println("product booked with charges : " +charges);
			}
			@Override//Step 13
			public String toString() {
				String accNm="NETHRA NISHA";
				System.out.println(accNm.toString());
				System.out.println("===================================================");
				return accNm;
			}
			@Override
			public void Bookproduct1(float charges) {
				// TODO Auto-generated method stub
				
			}
			
				
			}
		

	


