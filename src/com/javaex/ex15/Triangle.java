package com.javaex.ex15;

public class Triangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		
	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
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

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", lineColor=" + lineColor + ", fillColor="
				+ fillColor + "]";
	}
	
	public void showInfo() {
		System.out.println("=====삼각형을 그렸습니다.=====");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("색상: " + fillColor);
		System.out.println("라인색상: " + lineColor);
		System.out.println("========================");
	}
	
	
}
