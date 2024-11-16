package com.qsp.oops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Entered elements are : ");
		for(int x:a)
		{
			System.out.println(x);
		}
		swap(a);
	}
	public static void swap(int a[])
	{
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter the positions of the elements to swap :");
			int i = s.nextInt();
			int j = s.nextInt();
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
			
			System.out.println("After Swap");
			for(int x:a)
			{
				System.out.println(x);
			}
	}
}