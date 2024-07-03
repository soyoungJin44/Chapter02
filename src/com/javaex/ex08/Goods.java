package com.javaex.ex08;

public class Goods {
	//필드
	private String name;
	private int price;
	
	//생성자(기본 생성자,모두)
	public Goods() {
		
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메서드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//일반 메서드
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	//draw 작성 해야함
}
