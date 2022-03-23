package com.lec.java.final01;

public class Final01Main {
	
	//final 멤버 변수
	
	final int NUM1 = 1;
	final int NUM3;
	
	public Final01Main() {
		NUM3 =10;
	}
	
	
	public static void main(String[] args) {
		System.out.println("final: 변경할 수 없는 상수");
		
		//변수:
		int num1 = 1;
		num1 = 10;
		
		//상수: 한번 값이 초기화 되면 더이상 변경할 수 없다.
		final int num2 = 1;
		
		final int num3;
	} // end main()

} // end class Final01Main










