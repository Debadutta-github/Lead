package com.qsp.oops;
import java.util.Scanner;

public class BiggestArray {

	public static void main(String[] args) {
		System.out.println("Number the array");
		Scanner s = new Scanner(System.in);
		int size= s.nextInt();
		int a[]=new int[size];
		 System.out.println("Enter " + size + " numbers:");
	        for (int i = 0; i < a.length; i++) 
	        {
	            System.out.print("Element " + (i + 1) + ": ");
	            a[i] = s.nextInt();
	        }
		
		int max=a[0];
		int min=a[0];
		int count = 0;
		int even = 0;
		int odd = 0;
		//Maximum
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			max=a[i];
		
		}
		//Minimum
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			min=a[i];
		
		}
		//Count
		for(int i=0;i<=a.length-1;i++)
		{
			count++;
		}
		System.out.println();	
		int j=0;
		System.out.println("User given Number is : " );
		for(int x:a)
		{
			j++;
			
			System.out.println(j +") " + x);
		}
		System.out.println("The Even no are : ");
	//	isEven(a);
		for(int i=0;i<=a.length-1;i++)
		{
			
			if(a[i]%2==0)
			{
			even++;
			i=j;
			isEven(a);
			
			
			//System.out.println(a[i]);
			}
					
		}
	
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			odd++;
		
		}
	
		System.out.println();
		System.out.println("Biggest number is : " + max);
		System.out.println("Smallest number is : " + min);
		System.out.println("Total number is : " + count);
		System.out.println("Total even number is : " + even);
		System.out.println("Total odd number is : " + odd);
		
		
	}
	public static void isEven(int x[])
	{
		System.out.println(x.toString());
		for(int j=0;j<=x.length-1;j++)
		{
			System.out.println(x[j]);
		}
	}

	

}
