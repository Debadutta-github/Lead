package com.qsp.oops;

public class Property {

	public static void main(String[] args) {
//		Rent R = new Rent(1234,"Qspider",456);
//		System.out.println(R.getRoomno());
//		R.Sharing();
//		R.BTM();
		
		Own O = new Own(5435,"Whitefield",656);
		System.out.println(O.getRoomno());
		System.out.println(O.bill);
		System.out.println(O.add);
		O.BHK();
		O.BTM();

	}
	
}
