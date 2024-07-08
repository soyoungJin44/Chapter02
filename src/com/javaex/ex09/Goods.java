package com.javaex.ex09;

public class Goods {
	//필드
	private String neme;
	private int price;
	// private int count; >> name 처럼 한번씩 찍어서 쓸거야
	private static int count; // >>[static]  

	//생성자
	public Goods() {
		
	}
	
	public Goods(String neme, int price) {
		this.neme = neme;
		this.price = price;
		
		count++; //값을 읽어서 출력할수만 있게끔 get만 사용
	}
	
	//메서드 gs
	public String getNeme() {
		return neme;
	}
	public void setNeme(String neme) {
		this.neme = neme;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	
	//메서드 일반
	@Override
	public String toString() {
		return "Goods [neme=" + neme + ", price=" + price + ", count=" + count + "]";
	}
}
