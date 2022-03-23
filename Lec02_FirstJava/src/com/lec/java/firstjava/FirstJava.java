package com.lec.java.firstjava;
/*
모든 자바 프로그램은 main() 메소드로부터 '시작'한다
프로그램 실행순서는 '시작' 부터 한 문장(Statement) 씩 실행되는 것이 원칙
문장의 끝은 반드시 세미콜론 ';' 으로 마무리 해야 한다
*/
public class FirstJava {

	public static void main(String[] args) {
		System.out.println("My first Java App");
		System.out.println(123);
		System.out.println(10 + 20);  // 숫자 + 숫자 => 산술연산
		System.out.println(10 * 20);  // 정수 와 정수 의 연산 결과는 => 정수
		System.out.println(10 - 20);
		System.out.println(10 / 20);
		
		System.out.println(10.0 + 20.0); // 실수와의 연산 결과는 => 무조건 실수
		System.out.println(10 + 20.0);
		System.out.println(20.0 + 10);
		System.out.println(10 / 20.0);
		System.out.println(.1 + .023);
		System.out.println(123. / 4.);
		
		// "~" : 문자열 (String)
		// 문자열끼리의 덧셈 => 문자열 연결
		System.out.println("안녕하세요" + "여러분!");
		
		// "문자열" + 숫자 => 문자열
		//           ↓ 문자열 변환
		// "문자열" + "숫자" => 문자열
		System.out.println("결과:" + 10);
		System.out.println("결과:" + 10 + 20);
		// 
		//                  "결과:10"  + "20"
		System.out.println(10 + 20 + ":결과");
		System.out.println("결과:" + (10 + 20));
		
		// println(), print()
		System.out.print("안녕");
		System.out.print("하세요");
		System.out.println();
		
		// 이스케이프 문자 (escape character)
		// She says "Hi"  <-- 출력하려면?
		System.out.println("She says \"Hi\"");
		
		// 입문시 기억해야할 이스케이프 문자
		// \"
		// \t
		// \ns
		// \\
		
		System.out.println("123\t456\t789");
		System.out.println("1234\t5678\t9");
		System.out.println("Avengers\n\\Endgame\\");
		
		
		System.out.println("프로그램 종료");
	}
	
}























