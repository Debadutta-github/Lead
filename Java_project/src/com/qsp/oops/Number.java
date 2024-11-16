package com.qsp.oops;

import java.util.Scanner;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
//		String a[]= {"Red","Blue","Black","Pink"};
//		for(String i:a)
//		{
//			System.out.println(i);
//		}
//		for(int i=0;i<=a.length-1;i++)
//		{
//			System.out.println(a[1]);
//		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print("* "+" ");
			}
			System.out.println();
			
		}
		String x = "Debadutta";
	
		System.out.println(x);
		
		char ch[]=x.toCharArray();
		for(char i : ch)
		{
			System.out.println(i);
		}
	}
}




