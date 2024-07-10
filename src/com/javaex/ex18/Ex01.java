package com.javaex.ex18;

import java.util.Scanner;
		//***예외처리*** 
public class Ex01 {
	
	public static void main(String[] args) {
		
		new ArithmeticException();
		Scanner sc = new Scanner(System.in);		//jave.util <<에 들어있게찌

		int num = sc.nextInt();
		
		try{
			double result = 100/num;
			System.out.println(result);
			
		}catch(ArithmeticException e) {			//ArithmeticException >> 0으로 나눌때 라는뜻 공식으로 e붙여주기(관례)
			System.out.println(e.toString());		// 오류부분에 java.lang.~~~~~ 여기서 설정된 toString 멘트임 
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(ClassCastException e) {
			System.out.println("형변환 할 수 없습니다.");
		}finally {
			System.out.println("공통인 영역");			//finally 부분 생략 가능
		}
		
		System.out.println("프로그램 종료");
		
		double result = 100/num;		//예외 상황이 생길 수 있기때문에 try catch문으로 검사 ㅇㅇ
		
		//System.out.println(result);
		
		
	}

}
		
		
