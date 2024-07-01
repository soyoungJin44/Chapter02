package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		
		//컴퓨터 가격 출력
		System.out.println(computer.price);
		
		//컵이름
		System.out.println(cup.name);
		
		//컵 가격
		System.out.println(cup.price);
		
		//컴퓨터 가격 >> 필요할때마다 불러와서 쓸 수 있다.
		System.out.println(computer.price);
		
		
	}

}
