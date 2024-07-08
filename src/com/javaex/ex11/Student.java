package com.javaex.ex11;
//  <상속> >> 기존 person에 schoolName만 추가 하고 싶을 때
public class Student extends Person { //extends Person : Person 클래스와 연결해서 자식클래스라는 뜻
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		super();
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student(String name, int age) {
		super(name,age);
	}
	
	public Student(String name, int age, String schoolName) {
		/*
		super.setName(name);  //private 있으면 못뚫음. 자기클래스꺼 this, 부모쪽꺼 생성자부분은 super.
		super.setAge(age);
		*/
		//  <2>번째방법 (위와 원리는 동일함)
		super(name,age);
		/*
		 <3번째 방법 : 부모 변수앞에 private 말고 protected 사용해서 자식 class만 사용가능하게 변경
		super.name = name;
		super.age = age;
		*/
		this.schoolName = schoolName;
	}
	
	//메서드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메서드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	public void showInfo() {
		if(schoolName == null) {
			System.out.println("==================");
			System.out.println("이름: " + super.getName());
			System.out.println("나이: " + super.getAge());
			System.out.println("==================");
		}else {
			System.out.println("==================");
			System.out.println("이름: " + super.getName()); //부모class에서 private로 막혀있기 때문에 get으로 가져온다
			System.out.println("나이: " + super.getAge());
			System.out.println("학교: " + schoolName);
			System.out.println("==================");
		}
		
		
	}
	
}
