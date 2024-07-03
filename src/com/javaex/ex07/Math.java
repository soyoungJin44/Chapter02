package com.javaex.ex07;

public class Math {

	//필드
	// =필요없음
	
	//생성자
	public Math() {		//>>디폴트 생성자
		
	}
	
	//메서드 sg
	// =없음
	
	
	//일반 메서드 >>오버로딩 메서드 사용
	
	public int Plus(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public double Plus(double a,int b) {
		double sum = a+b;
		return sum;
	}
	
	public double Plus(double a,double b) {
		double sum = a+b;
		return sum;
	}
	
	public double Plus(int a,double b) {
		double sum = a+b;
		return sum;
	}
	
	
	
}
