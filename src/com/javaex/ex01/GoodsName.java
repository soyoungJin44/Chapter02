package com.javaex.ex01;

public class GoodsName {

	public static void main(String[] args) {

		//메모리에(힙) 올리고 >> 스택에 올리기 
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
	}

}
