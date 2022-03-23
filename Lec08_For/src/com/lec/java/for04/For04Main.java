package com.lec.java.for04;

public class For04Main {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		System.out.println("\n 2와 7의 공배수 출력 ");
		for(int i=1; i< 101; i++) {
			if(i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		int n = 1000;
		System.out.printf("\n1 부터 %d까지의 합\n", n );
		int sum= 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);
	} // end main ()

} // end class For04Main










