package com.shopping;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges);
	public NormalAcc NewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	// TODO Auto-generated method stub
	return null;
}
	public abstract NormalAcc NewNormalAcc(int accNo, String accNm, float charges);
	
}


