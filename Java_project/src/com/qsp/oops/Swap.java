package com.qsp.oops;

public class Swap {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Entered Number are : ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println();
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After Swapping Number are : ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
