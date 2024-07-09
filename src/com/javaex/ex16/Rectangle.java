package com.javaex.ex16;

public class Rectangle extends Shape{

	//필드
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height,String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	//메서드 gs

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getSight() {
		return height;
	}

	public void setSight(int sight) {
		this.height = sight;
	}
	
	//메서드 일반
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}
	public double area() {
		return width*height;
	}

}
