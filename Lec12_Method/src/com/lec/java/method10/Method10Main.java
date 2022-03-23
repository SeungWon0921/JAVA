package com.lec.java.method10;

import java.util.Scanner;

/* 메소드와 배열
 * 매개변수가 배열,  리턴타입이 배열
 */
public class Method10Main {
	public static final int NUM_STUDENT = 10;

	public static void main(String[] args) {
		System.out.println("메소드와 배열");
		Scanner sc = new Scanner(System.in);
		
		int score [] = new int [NUM_STUDENT];
		
		displayScore(score);
		
		inputScore(sc, score);
		
		displayScore(score);
		
		int total = calcTotal(score);
		System.out.println("총점: " + total);
		
		double average = (double) total / NUM_STUDENT;
		System.out.println("평균: " + average);
		
		int max = findMax(score);
		System.out.println("최댓값: " + max);
		
		int  min = findMin(score);
		System.out.println("최솟값: " + min);
		
		sc.close();
		System.out.println("\n프로그램 종료");
	} // end main()
	
	// method name: inputScore
	// return: void
	// arguments: 
	//   1) Scanner sc - 입력장치
	//   2) int[] score: 점수를 입력받아서 저장할 배열
	public static void inputScore(Scanner sc, int [] score) {
		System.out.println("length: " + score.length);
		
		for( int i = 0; i < score.length; i++) {
			System.out.println("점수 " + (i + 1) + " 입력:");
			score[i] =sc.nextInt();
		}
	}
	
	// method name: displayScore
	// return: void
	// arguments: int[] score - 출력할 점수가 저장된 배열
	 public static void displayScore(int [] score){
		 System.out.println("점수");
		 System.out.println("-----------------------");
		 for(int x: score) {
			 System.out.println(x + ", ");
		 }
		 System.out.println();
		 System.out.println("-----------------------");
		 
	 }
	
	
	
	// method name: calcTotal
	// return: int (계산된 총점을 리턴)
	// arguments: int[] score (점수들을 저장한 배열)
	public static int calcTotal(int [] score) {
		int total = 0;
		for(int x : score) {
			total += x;
		}
		return total;
	}

	
	// method name: findMax
	// return: int (최대값)
	// arguments: int[] score (점수들 저장된 배열)
	public static int findMax(int [] score) {
		int max = score[0];
		for(int i = 1; i<score.length; i++) {
			if(max < score[i])
				max = score[i];
		}
		return max;
	}
	
	
	// method name: findMin()
	// return: int (최소값)
	// arguments: int[] score
	public static int findMin(int [] score) {
		int min = score[0];
		for(int i =0; i < score.length; i++) {
			if(min > score[i])
			min = score[i];
		}
		return min;
	}
	
	// method name: genRandom()
	// return: double[]  (생성된 난수 배열)
	// arguments: n  생성할 난수 개수
	// TODO
	
} // end class Method09Main












