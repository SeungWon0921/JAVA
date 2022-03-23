package com.lec.java.wrapper02;

/* Java 5부터 wrapper 클래스의 auto-boxing/unboxing 기능 제공
 * 	boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
 * 	unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
 */
public class Wrapper02Main {

	public static void main(String[] args) {
		System.out.println("auto-boxing, auto-unboxing");

		Integer num1 = 10;
		Integer num2 = 20;
		Integer num3 = num1 + num2;
		Integer num30 = num1.intValue() + num2.intValue();
		
		System.out.println("num3 =" + num3);
		
		System.out.println();
		System.out.println("boxing/unboxing");
		// boxing(포장): 기본자료형의 값을 wrapper 클래스에 저장하는 것
		// unboxing(개봉): wrapper 클래스에 저장된 기본자료형 값을 꺼내는 것
		
		Integer num4 = Integer.valueOf(100); //boxing
		int n4 = num4.intValue();  			//unboxing
		
		System.out.println();
		System.out.println("auto-boxing/auto-unboxing");

		Long num100 = Long.valueOf(1000000000L);
		num100 = 1000000000L;
		
		Double num200 = 3.14;	//boxing
		double d200 = num200;	//unboxing
		
		System.out.println();
		System.out.println("wrapper 클래스들");
		
		Integer num5 =100;
		System.out.println(num5 == 100);	//int값 비교, unboxing
		
		Integer num6 = 100;
		
		System.out.println(num5 == num6); //주소 비
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class















