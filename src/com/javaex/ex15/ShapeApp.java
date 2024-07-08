package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Rectangle[] rArray = new Rectangle[3];
		Circle[] cArray = new Circle[1];
		Triangle[] tArray = new Triangle[1];
		*/
		
		Shape[] sArray = new Shape[3];
		
		
		//사각형
		Shape r01 = new Rectangle (3,5,"빨강","파랑");   //Rectangle형 객체 r01 을 Shape형으로 형변환 해준 후 배열에 넣기 위해서.
		Shape r02 = new Rectangle (3,7,"빨강","파랑");
		Shape r03 = new Rectangle (0,4,"빨강","파랑");
		
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = r03;
		
		
		//System.out.println(r01.toString());
		//r01.showInfo();
		/*
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length;i++) {
			rArray[i].showInfo();
		}
		*/
		//원
		Circle c01 = new Circle(5,"보라","하늘");
		//System.out.println(c01.toString());
		//c01.showInfo();
		/*
		cArray[0] = c01;
	
		for(int i=0; i<cArray.length; i++) {
			cArray[i].showInfo();
		}
		*/
		//삼각형
		Triangle t01 = new Triangle(1,5,"빨강","노랑");
		//System.out.println(t01.toString());
		//t01.showInfo();
		/*
		tArray[0] = t01;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].showInfo();
		}
		*/
		
		
	}
	
}
