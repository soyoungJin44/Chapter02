package com.javaex.ex16;

public abstract class Shape{		//오버라이딩용 abstract
	
	//필드
	protected String fillColor;		//자식class 들은 접근 가능하게 private 보다는 protected로 만들어주기(부로 class)
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
	public abstract void draw();		//오버라이딩용 abstract
	
	public abstract double area();		//abstract >>만들어져있다. 오버라이딩 해야한다>>>꼭만들어라 ㅇㅇ
	
}

	

