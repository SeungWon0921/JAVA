package com.lec.java.exception08;

import java.util.Scanner;

public class Exception08Main {

	static Scanner sc = new Scanner(System.in);
	
	// TODO : AgeInputException 을 throws 하는 메소드 정의
	public static int inputAge() throws AgeInputException {
		System.out.println("나이 입력:");
		int age = sc.nextInt();

		// TODO : AgeInputException 을 throw 하기
		if (age < 0) {
			AgeInputException ex = new AgeInputException();
			throw ex;
		}
		
		return age;
		
	} // end inputAge()
	
	
	public static void main(String[] args) {
		System.out.println("예외 클래스 만들기 2");
		
		int age;
		
		while(true) {
		try {
			age = inputAge();
			System.out.println("나이: " + age);
			break;
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("다시 입력하세요");
			sc.nextLine();
			}
		}
		sc.close();
		
		System.out.println("프로그램 종료...");
		
	} // end main()

} // end class Exception08Main












