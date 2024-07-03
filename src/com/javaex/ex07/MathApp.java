package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {

		Math math = new Math();
		
		math.Plus(1,2);
		System.out.println(math.Plus(1.1, 2));
		System.out.println(math.Plus(4.4, 1.1));
		System.out.println(math.Plus(1,2));
		System.out.println(math.Plus(1,2.5));
		
		
	}

}
