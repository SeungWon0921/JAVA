package com.lec.java.oop03;

public class Polymorphism03Main {

	public static void main(String[] args) {
		System.out.println("다형성의 어려움");
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		car2.setSpeed(10);
		
		car2.displayInfo();
		
		((Car)car2).setOil(50);
		
		car2.displayInfo();
		
		((Car)car1).setOil(10);
		
		System.out.println("\n 프로그램 종료");
	} // end main()

} // end class













































