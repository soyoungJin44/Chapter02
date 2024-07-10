package com.javaex.ex19;

public class MyFileApp {
		//***파일 추가 오류***
	public static void main(String[] args) {

		MyFile mf = new MyFile();
		String str = mf.read("c:/school.txt");
		
		System.out.println(str);
		
		//예외 발생 상황극
		String str2 = mf.read2("c/school.txt");
		
		//예외2
		try {
			mf.read3("c/aksf");
			
		}catch(IOException e){
			System.out.println("기본파일 강제로 만들기 로직");
		}
		
		
		System.out.println("정상종료");
		
	}
}
