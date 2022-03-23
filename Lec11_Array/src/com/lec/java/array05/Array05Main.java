package com.lec.java.array05;

import java.util.Scanner;

/* 2차원 배열 (2-dimensional array)
 * 	직전의 예제와 같이 같이 배열 첨자를 하나만 쓰는 배열을 
 *  1차원 배열 (one-dimensional array) 이라고 함
 *   배열 첨자를 2개사용하면 2차원 배열
 *   배열 첨자를 3개사용하면 3차원 배열
 *   ...
 *  
 *   배열원소가 '1차원 배열' 들로 이루어진 배열을 2차원 배열 이라 한다  (배열첨자 2개 사용)
 *   배열원소가 '2차원 배열' 들로 이루어진 배열을 3차원 배열 이라 한다  (배열첨자 3개 사용)
*/
public class Array05Main {

	public static void main(String[] args) {
		System.out.println("2차원 배열");
		
		int[][] array = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		System.out.println(array.length);
		// array의 타입 int[][]
		// array[]의 타입 int[]
		// array[][]의 타입 int
		
		for(int x = 0; x< array.length; x++) {
			for(int y=0; y<array[x].length; y++) {
				System.out.print(array[x][y] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array05Main









