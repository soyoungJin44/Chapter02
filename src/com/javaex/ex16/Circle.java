package com.javaex.ex16;

public class Circle extends Shape{
	//필드
	private int radius;

	//생성자
	public Circle() {
		super();
	}
	
	public Circle(int radius,String fillColor, String lineColor) {
		super(fillColor,lineColor);
		this.radius = radius;
	}
	//메서드 gs

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메서드 일반
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	public double area() {
		return (radius*radius*3.14);
	}
	
}
