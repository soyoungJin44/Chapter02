package com.javaex.ex03;
// 바로 값을 대입하는 코드는 좋은 코드가 아니다. **private는 극단적으로 다 막는것.   **public은 다 풀어주는것.

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		Goods cup = new Goods();
		Goods camera = new Goods();
		
		/*
		computer.name = "LG그램"; // 틀에서 private를 써서 캡슐화 했기 때문에, 바로 직접적으로 값을 넣을때 오류가 난다. 
		computer.price = 1000000; //price에는 캡슐화(private)를 하지 않았기 때문에 오류가 나지않고 바로 값 대입이 가능하다.
		
		Goods cup = new Goods(); //위와동일
		cup.name = "머그컵";
		cup.price = 2000;
		*/
		
		computer.setName("LG그램");
		//System.out.println(computer.getName());
		
		computer.setPrice(1000000);
		//System.out.println(computer.getPrice());
		
		cup.setName("머그컵");
		//System.out.println(cup.getName());
		
		cup.setPrice(2000);
		//System.out.println(cup.getPrice());
		
		camera.setName("니콘");
		//System.out.println(camera.getName());
		
		camera.setPrice(400000);
		//System.out.println(camera.getPrice());

		
		//System.out.println(computer.getName() + " 가격은 " + computer.getPrice() + "원 입니다.");
		//System.out.println(cup.getName() + " 가격은 " + cup.getPrice()+"원 입니다.");
		//System.out.println(camera.getName() + " 가격은 " + camera.getPrice()+"원 입니다.");
		
		/*
		System.out.println("상품이름: " + camera.getName());
		System.out.println("가격: " + camera.getPrice());
		System.out.println("");
		System.out.println("상품이름: " + computer.getName());
		System.out.println("가격: " + computer.getPrice());
		System.out.println("");
		System.out.println("상품이름: " + cup.getName());
		System.out.println("가격: " + cup.getPrice());
		*/
		
		camera.showInFo();
		computer.showInFo();
		cup.showInFo();
		
		
		
		
		
	}

}