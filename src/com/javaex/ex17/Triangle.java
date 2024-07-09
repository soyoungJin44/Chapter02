package com.javaex.ex17;

public class Triangle extends Shape implements Drawable{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		super();
	}
	
	public Triangle(int width, int height, String fillColor, String lineColor) {
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메서드 일반
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	public double area() {
		return (width*height/2);
	}

}
