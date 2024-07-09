package com.javaex.ex17;

public abstract class Shape{		
	
	//필드
	protected String fillColor;		
	protected String lineColor;
	
	//생성자
	public Shape() {
		super();
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	//메서드 gs

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
	//메서드 일반
	//public abstract void draw();     >>interface 에서 관리		
	
	public abstract double area();	
	
}

	

