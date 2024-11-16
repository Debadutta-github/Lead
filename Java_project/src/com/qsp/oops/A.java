package com.qsp.oops;

public class A {
	public static void main(String[] args) {
		final int a[]= {2,3,7};
		A.display(a);
		System.out.println("From Main Method");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}
		public static void display(int b[]) {
			System.out.println("From Display Method");
			for(int i=0; i<=b.length-1; i++)
			{
				b[i]=b[i]*2;
				System.out.println(b[i]);
			}
			
		}
		
	}


