package com.lec.java.inner05;

public class TestOuter2 {
	 
	//TestOuter 클래스의 멤버 변수
	private int num = 100; // ① 
	
	// TestOuter 클래스의 멤버 메소드
	public void localMethod() {
		
		int num = 200;  // ②
		
		class TestLocal {
			
			private int num = 300;  // ③
			
			public void showNumber() {
				
				int num = 400;   // ④ 
				
				// ①, ②, ③, ④  출력 가능?
				
				System.out.println("TestOuter2.this.nu = " + TestOuter2.this.num);  // ①
				System.out.println("this.num = " + this.num); // ③
				System.out.println("num = " + num);  // ④
				
				//② 는 사용 불가!
				
			}
			
		} // end local inner class
		
		TestLocal local = new TestLocal();
		local.showNumber();
		
	} // end localMethod()
	

} // end class TestOuter













