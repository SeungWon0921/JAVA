package com.lec.java.class02;


public class Class02Main {

	public static void main(String[] args) {
		System.out.println("클래스 연습");		
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);
		
		double perimeter = c1.calcPerimeter();
		System.out.println("c1의 둘레:" + perimeter);
		perimeter = c2.calcPerimeter();
		System.out.println("c2의 둘레:" + perimeter);
		
		double area = c1.calcArea();
		System.out.println("c1의 넓이: " + area);
		area = c2.calcArea();
		System.out.println("c2의 넓이: " + area);
		
		// Rentangld 인스턴스 2개이상 생성, 동작시기
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class Class02Main










