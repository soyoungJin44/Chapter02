package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		//Shape배열로 도형관리 (사각형,  원, 삼각형)
		Shape[] sArray = new Shape[3];
		
		//도형만들기
		Shape r01 = new Rectangle(2,2,"검정","빨강");		//사각형
		Shape c01 = new Circle(5,"검정","보라");			//삼각형
		Shape t01 = new Triangle(655,8,"빨강","노랑");		//원 형
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		for(int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
