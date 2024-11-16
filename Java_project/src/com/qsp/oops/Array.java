package com.qsp.oops;

import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String x[]= new String[4];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		for(int i=0; i<4; i++)
		{
			x[i] = s.nextLine();
		}
		Array.display(x);
				
	}
	public static void display(String a[])
	{
		System.out.println("The entered values are");
		for(String i:a)
		{
			System.out.println(i);
		}
	}

}
