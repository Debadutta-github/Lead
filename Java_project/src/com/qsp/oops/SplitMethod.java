package com.qsp.oops;

public class SplitMethod {
	public static void main(String[] args) {
		String sp = "abc@gmail.com";
		String[] a = sp.split("[@,.]");
		
		for (String string : a) {
			//System.out.println(string);
			System.out.print(string);
			
		}
		
		
	}

}
