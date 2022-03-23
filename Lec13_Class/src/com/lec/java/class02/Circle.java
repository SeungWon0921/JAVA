package com.lec.java.class02;

public class Circle {

	// 원의 상태(속성) -> 멤버변수 (필드)
	double radius;
	
	// 셍성자 
	public Circle() {
		System.out.println("Circle() 생성자 호출");
		System.out.println("반지름: " + radius);
	}
	
	public Circle(double r) {
		System.out.println("Circle(" + r + ") 생성자 호출");
		radius = r;
		System.out.println("반지름: " + radius);
	}
	
	// 원의 동작(기능) -> 메소
	// 원의 둘레 계
	public double calcPerimeter() {
		return 2* Math.PI * radius;
	}
	
	// 원의 넓이 계산
	public double calcArea() {
		return Math.PI * radius * radius;
	}
}
