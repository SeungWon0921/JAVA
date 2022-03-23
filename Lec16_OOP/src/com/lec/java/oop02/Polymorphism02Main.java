package com.lec.java.oop02;

/* 다형성의 유용성
	다형성에 의해서, 자식타입 객체가 부모타입으로 자동 형변환 가능!
	부모(조상)타입 만으로도 상속된 모~든 자손 타입들을 담을수 있다.
*/

public class Polymorphism02Main {

	public static void main(String[] args) {
		System.out.println("다형성의 사용 (유용성)");

		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Car();
		Vehicle car3 = new HybridCar();
		
		
		
		// 다형성의 유용함 1
		// 부모타입으로 모든 자손 타입들을 담을 수 있다.
		Vehicle [] car = new Vehicle[3];
		car[0] = new Vehicle();
		car[1] = new Car();
		car[2] = new HybridCar();
		
		for(int i = 0; i < car.length; i++) {
			car[i].displayInfo(); // 조상타입 한가지로 한꺼번에 동작 가능 
		}
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println();
		
		System.out.println(car1 instanceof Vehicle);
		System.out.println(car1 instanceof Car);
		System.out.println(car2 instanceof Vehicle);
		System.out.println(car2 instanceof HybridCar);
		
		System.out.println();
		
		System.out.println("\n 프로그램 종료");
	} // end main()
	
	public static void driverCar(Vehicle v) {
		v.setSpeed(100);
		v.displayInfo();
	}

} // end class












































