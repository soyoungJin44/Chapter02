package com.javaex.ex03;
//클래스명 [틀]   <캡슐화-private>
public class Goods {

	//<필드> -보호한다.(캡슐화) >>보호 할 수 있다.
	private String name;
	int price;
	
	//<생성자>
	
	//<메소드>
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	
	//가격저장
	public void setPrice(int p) {
		price = p;
	}
	
	//가격읽기
	public int getPrice() {
		return price;
	}
	//출력틀 저장
	public void showInFo() {
		System.out.println("상품이름: " + getName());
		System.out.println("가격: " + getPrice());
		System.out.println("===========");
	}
	
	
	//출력틀 읽기
	
}
	
	

