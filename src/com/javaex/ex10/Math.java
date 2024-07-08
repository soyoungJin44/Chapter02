package com.javaex.ex10;

public class Math {
	//필드
	private static double pi = 3.14;
	//생성자
	//스태틱으로 올릴거라 생성자 사용안함
	//메서드 gs
	
	//메서드
	public static int Plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public static double Plus(int a, double b) {
		double sum = a + b;
		return sum;
	}
	public static double Plus(double a, double b) {
		double sum = a+b;
		return sum;
	}
	public static double Plus(double a, int b) {
		double sum = a+b;
		return sum;
	}
	//원 넓이 구하기
	public static double Circle (int radius) {
		double area = pi * radius * radius;   //static을 먼저 체크하고 코드 돌리는데, 필드부분에 pi를 선언할 때 static으로 선언을 안했기때문에 얘는 모름 >> static으로 쓰려면 다 static사용해서 올려주면됨
		return area;
	}
	

}
