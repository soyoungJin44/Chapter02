package com.javaex.ex04;

public class Point {
	
	private int x;
	private int y;
	
	//필드
	
	//생성자
	
	public Point() {
		
	}
	/*
	public Point(int x) {
		this.x = x;
	}
	
	public Point(int y) {
		this.y = y;
	}
	*/ // **위 두가지는 동일한모습으로 인식한다ㅏ. Point(int) (자료형까지만) 확인을 하기 때문에 x,y를 구분할수는 없다.
	
	
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
