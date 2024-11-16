package com.qsp.oops;
import java.util.Scanner;

public class SwappingArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+" Elements :");
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
		System.out.println("After Swapping elements are : ");
		
		for(int i=0;i<=a.length-1;i++)
		{
			
			while(a[i]>0)
			{
				int rem=a[i]%10;
				a[i]=a[i]/10;
				System.out.print(rem);
			}
			System.out.println();
		}

	}

}
