package com.qsp.oops;
import java.util.Scanner;

public class Swastik {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==n/2+1||j==n/2+1||i==n && j<=n/2+1||i==1 && j>=n/2+1||j==1 && i<=n/2+1||j==n && i>n/2+1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}

	}

}
