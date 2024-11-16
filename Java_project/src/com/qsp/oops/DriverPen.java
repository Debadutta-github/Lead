
package com.qsp.oops;

public class DriverPen {
	public static void main(String[] args) {
		CrayonPen C = new CrayonPen();
		DriverPen.select(C);
		
		SketchPen D = new SketchPen();
		DriverPen.select(D);
	}
	public static void select (Pebn x)
	{
		x.view();
		
	}

}
