package com.lec.java.array03;

public class Array03Main {

	public static void main(String[] args) {
		System.out.println("여러가지 자료형의 배열");
		
		System.out.println();
		System.out.println("[1] double형 배열");
		// 타입[] 이름 = new 타입[배열 길이];
		// 타입[] 이름 = new 타입[] {a, b, ...};
		// 타입[] 이름 = {a, b, ...};

		double [] array1 = {1.2, 2.3, 3.4};
		for (int i=0; i< array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
		}
		
		
		System.out.println();
		System.out.println("[2] char형 배열");
		
		// TODO
		
		
		System.out.println();
		System.out.println("[3] boolean형 배열");

		// TODO
		
		
		System.out.println();
		System.out.println("[4] String형의 배열");

		String[] array4 = new String[3];
		array4 [0] = "Hello Java";
		array4 [1] = "Hello C++";
		array4 [2] = "Hello HTML5";
		
		for ( int i =0; i < array4.length; i++) {
			System.out.println("array4[" + i + "] = " + array4[i]);
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array03Main



























