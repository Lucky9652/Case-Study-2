package com.shopping;

public class OnlineShoppingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GSShopFactory a1=new GSShopFactory();
		a1.getNewPrimeAcc(900, "Karthik Nisha",100.0F,true );
		a1.getNewNormalAcc(345678,"KARTHIK MUNIKRISHNA", 80.0F, 100.0F);
		a1.NewPrimeAcc(144566677, "NETHRA NISHA", 400.0F, false);
		a1.NewNormalAcc(608798776,"VENKATESH", 2000.0F, 50.0F);
		
		GSPrimeAcc a2=new GSPrimeAcc(235647,"NETHRA NISHA",300.0F,true);
		a2.Bookproduct();
		a2.toString();
		
		GSNormalAcc a3=new GSNormalAcc(325777,"Venkatesh Munirkishna",340.0F);
		a3.Bookproduct(650);
		a3.toString();
		

	}

}
