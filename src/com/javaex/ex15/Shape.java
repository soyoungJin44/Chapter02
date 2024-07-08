package com.javaex.ex15;

public class Shape {
	
	//필드 <line Coler , fillColor
	protected String lineColor;
	protected String fillColor;
	
	//생성자
	public Shape() {
		
	}
	
	public Shape(String lineColor, String fillColor) {
		super();
		lineColor = lineColor;
		this.fillColor = fillColor;
	}

	
	//메서드 gs
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	//메서드 일반
	@Override
	public String toString() {
		return "Shape [LineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	

}
