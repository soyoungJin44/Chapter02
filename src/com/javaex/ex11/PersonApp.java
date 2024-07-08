package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {

		Person p01 = new Person("정우성",45);
		p01.showInfo();
		
		Student s1 = new Student("이정재",45,"한국고등학교");
		s1.showInfo();
		
		Student s2 = new Student("이효리",53,"초등학교");
		s2.showInfo();
		s2.showInfo(); //showInfo 에 숫자를 붙여서 부모class와 자식 class를 구분해두면 잘못쓸수도 있기때문에 의도적으로 이름을 같게 만든다
		
		Student s3 = new Student("문준원",3);
		s3.showInfo();
		
	}

}
