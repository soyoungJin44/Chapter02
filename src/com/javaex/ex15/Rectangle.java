package com.javaex.ex15;

public class Rectangle extends Shape {
	
	//필드   (color 2가지는 부모class에서)
	private int width;
	private int height;
	
	//생성자
	
	public Rectangle() {
	}
	
	public Rectangle(int width, int height,String lineColor, String fillColor) {
		super();
		this.lineColor = lineColor;
		this.fillColor = fillColor;
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

	@Override
	public String toString() { //부모 class와 이름 같게 썼다 == 부모쪽 class에 있는것은 사용하지 않겠다 ㅇㅇ
		return "Rectangle [width=" + width + ", height=" + height + "fillColor =" + this.fillColor + "lineColor =" + this.lineColor + "]";
	}

	//메서드 일반
	public void showInfo() {
		System.out.println("=====사각형=====");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("색상: " + fillColor);
		System.out.println("선색상: " + lineColor);
		System.out.println("==============");
	}
}
