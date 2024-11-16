package com.qsp.oops;
import java.util.*;
public class Practice {
	public static void main(String[] args) {
//		int x[]= {34,98,54,56,87};
//		System.out.println(x.toString());
		System.out.println("Steps Given");
		Scanner sc = new Scanner(System.in);
		int steps = sc.nextInt();
		
		if(steps < 5000)
			System.out.println("Sedentery");
		else if(steps >= 5000 && steps <=7499)
			System.out.println("Low Active");
		else if(steps >= 7500 && steps <= 9999)
			System.out.println("Some What Active");
		else if(steps >= 10000 && steps <= 12499)
			System.out.println("Active");
		else if(steps > 12500)
			System.out.println("Highly Active");
	}
	
}

//Design a program that tracks a persons daily steps and categorizes their activity level based on the number of steps taken.Implement an else if ladder that takes the number of steps as input and outputs the corresponding activity level according to the following criteria:
//  			Less than 5000 steps:Sedentary
//  			5000 to 7499 steps :Low Active
//  			7500 to 9999 steps :Somewhat Active
//  			10000 to 12499 steps :Active
//  			12500 or more steps :Highly Active 
// 