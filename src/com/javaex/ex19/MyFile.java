package com.javaex.ex19;

import java.io.IOException;		//임포트 해줘야함

public class MyFile {

	//필드
	
	
	
	//생성자
	public MyFile() {
		
	}
	//메서드 gs
	
	//메서드 일반
	public String read(String path) {
		//path.의 파일을 읽어서 문자열로 추출한다.
		
		String result = "학교종이 땡";
		return result;
	}
	
	//파일이 없을 경우 가정
	public String read2(String path) {
		
		String result = "";
		
		try {
			//path의 파일을 찾는다. (파일이 없음>>예외상황)
			//파일의 내용을 읽는다.
			throw new IOException();
			
		}catch(IOException e) {
			System.out.println("파일이 없습니다");
			
		}
		
		return result;
	}
	
	public void read3(String path) throws IOException{
		String result = "";
		
		throw new IOException();
		
		
	}
	
}
