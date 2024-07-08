package com.javaex.ex15;

public class Circle extends Shape {
	
	//필드
	private int radius;
	//생성자
	public Circle() {
		super();
	}
	public Circle(int radius,String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	//메서드 gs
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메서드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void showInfo() {
		System.out.println("=====삼각형을 그렸습니다=====");
		System.out.println("반지름: " + radius);
		System.out.println("원색상: " + fillColor);
		System.out.println("라인색상: " + lineColor);
		System.out.println("=======================");
	}

}
