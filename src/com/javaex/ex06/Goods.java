package com.javaex.ex06;

public class Goods {
	//필드
	private String name;
	private int price;
	//<생성자> : <메모리에 올리는게 주업무> (안짜도됨 알아서 자동으로 됨 _ 개념만 )
	//**생성자는 리터럴값 적는 부분 비워둠, 이름은 class이름으로 이미 정해져있음 / 
	public Goods() {
		
	}
	//생성자의 주 기능은 ***메모리에 올리는게 주 업무*** 이기때문에 올리는 방식을 추가함.
	public Goods(String name, int price) {
		this.name = name;						//생성자를 작성자가 의지대로 코드를 작성하게되면, 디폴트 생성자코드[public Goods]는 작성되지않는다.
		this.price = price;						//(생성자 부분에 아무 코드도 작성하지않으면 그때는 디폴트 생성자코드가[public Goods] 작성된다.				
	}											//***두가지 생성자방식을 동시에 쓰고 싶다면, 디폴트 생성자코드가[public Goods]를 직접 작성하면된다.
	
	//메서드-gs(getter,setter)
	public String getName() {
		return name;
	}
	public void setName(String name) { // 메서드는 리터럴값이 없으면 비워두는게 아니라 void로 작성.
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//메서드-일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	//후에 출력할 draw 짜주기 남음

}
