package com.javaex.ex14;

public class Rectangle {
	
	//필드
	private int width;
	private int height;
	private String color;
	private String lineColor;
	
	
	//생성자
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height, String color, String lineColor) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.lineColor = lineColor;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
	//메서드 일반
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", lineColor=" + lineColor
				+ "]";
	}
	public void showInfo() {
		System.out.println("======사각형을 그렸습니다======");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("면색: " + color);
		System.out.println("선색: " + lineColor);
		System.out.println("=========================");
	}
	
}
