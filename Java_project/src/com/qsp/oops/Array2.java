package com.qsp.oops;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		float a[] = new float[5];
		System.out.println("Enter 5 float element");
		Scanner s = new Scanner(System.in);
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=s.nextFloat();			
		}
		Array2.view(a);
	}
	public static void view(float i[])
	{
		System.out.println("The 5 float element are");
		for(float x:i)
		{
			System.out.println(x);
		}
	}

}
