package com.qsp.oops;

public class B {
	public static void main(String[] args)  
	{
		final int a =100;
		System.out.println(a);
		B.display(a);
		System.out.println(a);
		
	}
	public static void display(int a) 
	{
		a=a+10;
		System.out.println(a);
	}

}
	