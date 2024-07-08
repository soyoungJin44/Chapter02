package com.javaex.ex09;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램",1000000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵",2000);
		System.out.println(cup.toString());
		
		Goods camera = new Goods("니콘",400000);
		System.out.println(camera.toString());
		
		System.out.println(computer.getCount());
		System.out.println(cup.getCount());
		
		// System.out.println(Goods.count);  //count를 ptivate로 선었했기때문에 안됨. public으로 선언하면 사용가능
		//보통 sout에 변수이름으로 호출하기때문에 소문자인경우가 많은데, 대문자일경우 Static을 사용했나 확인가능(class이름으로 호출하기때문에)
		
		
		
	}
}
