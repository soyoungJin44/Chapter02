package com.javaex.ex14;

public class ShapeApp {   //배열로 관리 >> 배열로 출력

	public static void main(String[] args) {

		//배열로 정리

		Rectangle[] rArray = new Rectangle[3];
		Circle[] cArray = new Circle[3];
		
		//**사각형**
		Rectangle r01 = new Rectangle(3,3,"빨강","노랑");
		
		Rectangle r02 = new Rectangle(10,20,"초록","보라");
		
		Rectangle r03 = new Rectangle(3,3,"회색","검정");
		/*
		r01.showInfo();
		r02.showInfo();
		r03.showInfo();
		*/
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].showInfo();
		}
		
		
		//**원**
		Circle c01 = new Circle(2,"초록","검정");
		Circle c02 = new Circle(321,"초록","검정");
		Circle c03 = new Circle(125,"파랑","갈색");
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].showInfo1();
		}
		
		
	}

}
