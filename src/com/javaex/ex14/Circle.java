package com.javaex.ex14;

public class Circle {

	//필드
	private int radius;
	private String fillColor;
	private String LineColor;
	
	//생서자
	public Circle() {
		
	}
	
	public Circle(int radius, String fillColor, String lineColor) {
		this.radius = radius;
		this.fillColor = fillColor;
		LineColor = lineColor;
	}

	
	//메서드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}

	
	//메서드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", LineColor=" + LineColor + "]";
	}
	
	public void showInfo1() {
		System.out.println("========원을 그렸습니다=======");
		System.out.println("가로: " + radius);
		System.out.println("세로: " + fillColor);
		System.out.println("선색: " + LineColor);
	}
	
}
