package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Drawable[] dArray = new Drawable[4];
		
		//Drawable 배열로 관리. >> draw()로 묶임
		Drawable p01 = new Point(1,2);
		Drawable r01 = new Rectangle(2,5,"d","sg");
		Drawable c01 = new Circle(5,"sg","sgd");
		Drawable t01 = new Triangle(5,6,"ㅇㄹ","ㄶ");
		
		dArray[0] = p01;
		dArray[1] = r01;
		dArray[2] = c01;
		dArray[3] = t01;
		
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		System.out.println(((Shape)r01).area() );   //Share로 형변환 후 해당 내용 출력
		System.out.println(((Shape)c01).lineColor);
		
		for(int i=0; i<dArray.length; i++) {		//Point 때문에 에러감
			if(dArray[i] instanceof Shape)
			System.out.println(((Shape)dArray[i]).area());
		}
		
	}

}
