package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		//컴퓨터 등록
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		//컵 등록
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		//카메라 등록
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = 400000;
		
		
		//컴퓨터 가격 출력
		System.out.println(computer.price);
		
		//컵이름
		System.out.println(cup.name);
		
		//컴퓨터 이름
		System.out.println(computer.name);
		
		//컵 가격
		System.out.println(cup.price);
		
		//컴퓨터 가격 >> 중복되도, 필요할때마다 불러와서 쓸 수 있다.
		System.out.println(computer.price);
		
		
	}

}
