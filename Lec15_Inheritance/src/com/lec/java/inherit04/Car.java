package com.lec.java.inherit04;

public class Car extends Vehicle {

	int oil;
	
	// 생성자
	public Car() {
		// 부모클래스의 기본생성자 호출 --> Vehicle()
		// 명시적으로 super() 가 없으면 기본적으로 부오의 기본생성자 호출 		
		System.out.println("Car() 생성");
	}
	
	public Car(int oil) {
		// 명시적으로 부모 생성자 호출
		super();  // super 는 반.드.시 첫번째 문장이어야 한다.
		System.out.println("Car(int) 생성: oil=" + oil);
		this.oil = oil;
	}
	
	public Car(int speed, int oil) {
		super(speed);  // Vehicle(int) 호출
		this.oil = oil;
		System.out.println("Car(int,int) 생성: speed=" + speed 
				+ "oil=" + oil);		
	}
}
