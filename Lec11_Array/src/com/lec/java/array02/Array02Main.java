package com.lec.java.array02;
/*  배열의 선언과 초기화
 	
 	배열 선언 따로, 초기화 따로
		타입[] 이름 = new 타입[배열의 길이];
		
	배열을 선언과 동시에 초기화 1
		타입[] 이름 = new 타입[] {a, b, c, ...};
		
	배열을 선언과 동시에 초기화 2
		타입[] 이름 = {a, b, c, ...};
		
	배열의 길이를 자동으로 알 수 있는 방법
		배열이름.length 
 */
public class Array02Main {

	public static void main(String[] args) {
		System.out.println("배열의 선언과 초기화");
		
		int [] kor = new int[3];
		kor[0] = 100;
		kor[1] = 90;
		kor[2] = 80;
		
		int [] eng = new int[] {30, 20, 30, 40};
		for(int i = 0; i < 4; i++) {
			System.out.println("영어" + i + ": " + eng[i]);
		}
		
		//배열 선언과 동시에 초기화 2
		int [] math = {100, 96 ,83, 25, 59,33,55,77,11,32,42};
		int total = 0;
		double avg;
		int n = 0;
		while(n< math.length) {
			System.out.println("수학" + n + ": " + math[n]);
			total += math[n];
			n++;
		}
		
		avg = (double)total/math.length;
		System.out.println("총점 = " + total + "평균 = " + avg);
		
		int[] score = {10,20,30,40,50};
		for (int i=0; i < score.length; i++) {
			
		}
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array02Main











