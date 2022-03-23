package com.lec.java.inherit02;

// BasicTV
//  └─ SmartTV
public class SmartTV extends BasicTV{ 
	
	// 새로이 추가할 멤버
	String ip;
	
	public void displayInfo() {
		super.displayInfo();  // 부모(super) 의 displayInfo() 를 먼저 실행하고
		System.out.println("IP 주소: " + ip);  // 추가되는 실행 코드
	}
}
