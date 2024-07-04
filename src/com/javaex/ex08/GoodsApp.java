package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		//물건의 갯수가 늘어나면 이름은 하나씩 확인해야하고, 수가 맞는지 확인해야한다.
		//배열에 주소값을 넣어서 효율적으로 사용가능
		
		Goods[] goodsArray = new Goods[2]; //int형 값을 넣을때 앞에 int쓰듯이 goodsArray를 따라갔을 때 Goods 가 있기 때문에 
		
		Goods computer = new Goods("LG그램",1000000);
		Goods cup = new Goods("머그컵",2000);
		
		//배열에 상품주소 추가
		goodsArray[0] = computer;
		goodsArray[1] = cup;
		
		//System.out.println(computer.toString());
		//System.out.println(cup.toString());
		
		//배열사용 
		System.out.println(cup.getName());
		System.out.println(goodsArray[1].getName());
	
		System.out.println(computer.getName());
		System.out.println(goodsArray[0].getName());
		System.out.println("====================");
		
		for(int i=0; i<goodsArray.length;i++) {
			System.out.println(goodsArray[i].getName());
		}
		for(int i=0; i<goodsArray.length;i++) {
			System.out.println(goodsArray[i].getPrice());
		}
		System.out.println("===============");
		for(int i=0; i<goodsArray.length;i++) {
			System.out.println(goodsArray[i].getName() +": " + goodsArray[i].getPrice());
		}
	}

}
