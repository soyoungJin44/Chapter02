package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {

		//
		
		Goods computer = new Goods(); //Goods() >>생성자에서 부른부분.
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		System.out.println(computer.toString());
		
		//생성자에 name,price 둘 다 올리는방식으로 작성했기때문에 입력방식도 똑같이 해주지않으면 동일하다고 생각하지 않음.(방식이 무조건 , 순서도 같아야함)
		Goods cup = new Goods("머그컵",2000); //생성자는 1번만 쓸수 있기때문에 수정할수가 없다. 
		/*
		cup.setName("머그컵"); >>메소드 부분에 입력받는 코드 짠 부분_setter>> 생성자에서 입력을 받았어도 필요함(수정을 여기서 해야함. 생성자는 1번만 사용할수있기때문)
		cup.setPrice(2000);
		*/
		System.out.println(cup.toString());
		
		
		
	}

}
