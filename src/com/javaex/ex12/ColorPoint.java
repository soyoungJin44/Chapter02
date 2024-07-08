package com.javaex.ex12;

public class ColorPoint extends Point {
	//배열
	private String color;
	//생성자
	public ColorPoint() {
		
	}

	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super.setX(x);
		super.setY(y);
		//super(x,y);
		this.color = color;
	}

	//메서드 gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//메서드 일반
	public void showInfo() {
		System.out.println(getX()+"," +getY()+"," +color);
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	

}
