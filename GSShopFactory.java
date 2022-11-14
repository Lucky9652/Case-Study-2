package com.shopping;
 class GSShopFactory extends ShopFactory
	{
		private boolean isPrime;
		private int accNo;
		private String accNm;
		private String isSalaried;
		private static float charges;
		
		public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
			return null;
		}
		{
			System.out.println("GET NEW PRIME ACCOUNT");
			System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " ISSALARIED:" +isSalaried);
			System.out.println("===================================================");
		}
	public  GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		System.out.println("GET NEW NORMAL ACCOUNT");
		System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " ISSALARIED:" +isSalaried);
		System.out.println("===================================================");
		return null;
	}

	public  PrimeAcc NewPrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
				System.out.println(" NEW PRIME ACCOUNT");
				System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " ISPRIME:" +isPrime);
				System.out.println("===================================================");
			
				return null;
			}
	@Override
	public NormalAcc NewNormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		System.out.println(" NEW NORMAL ACCOUNT");
		System.out.println("ACCOUNT NO:" +accNo+ "ACCOUNT NM :"+accNm+" CHARGES:" +charges+ " ISSALARIED:" +isSalaried);
		System.out.println("===================================================");

		return null;
	}

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalAcc NewNormalAcc(int accNo, String accNm, float charges) {
		// TODO Auto-generated method stub
		return null;
	}


}
