package com.lec.java.class02;

public class Rectangle {
	
	// 직사각형의 속성
	// 너비, 높이
	private double width;
	private double height;
	
	// 디폴트 생성자
	public Rectangle() {
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
	}
	
	// 너비와 높이를 매개변수로 받아 초기화 하는 생성자
	public Rectangle(double w, double h) {
		width = w;
		height = h;
		System.out.println("가로: " +width);
		System.out.println("세로: " + height);
	}
	// 직사각형의 동작
	// 사각형의 둘레 
	public double calcPerimeter() {
		return (width + height) * 2;
	}
	
	// 사각형의 넓이
	public double
	
}
