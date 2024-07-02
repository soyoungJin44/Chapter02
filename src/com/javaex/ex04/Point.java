package com.javaex.ex04;

public class Point {
	
	private int x;
	private int y;
	
	//필드
	
	//생성자
	
	//메서드
	//<좌표 받을곳>
	public void setX(int x) {
		//로직 짜는곳
		this.x = x;
	}
	//<좌표 읽을곳>
	public int getX() {
		//로직 짜는곳
		return x;
	}
	public void setY(int y) { //setter
		this.y = y;
	}
	public int getY() { //getter
		return y;
	}
	
	public void draw() {
		System.out.println("점[x= " + getX() + "],점[y= " + getY() +"]를 그렸습니다.");
	}
	
	
}
