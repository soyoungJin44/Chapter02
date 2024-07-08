package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4,4);
		System.out.println(p.toString());
		
		ColorPoint cp1 = new ColorPoint("red");
		System.out.println(cp1.toString());
		
		ColorPoint cp2 = new ColorPoint(10,10,"black");
		cp2.showInfo();
		
		
		
	}

} 
