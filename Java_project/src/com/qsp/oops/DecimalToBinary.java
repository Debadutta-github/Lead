package com.qsp.oops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int rem = 0;
		while(number>0)
		{
			rem = number%2;
			System.out.println(rem);
			
		}
		System.out.println(rem);
	}

}
