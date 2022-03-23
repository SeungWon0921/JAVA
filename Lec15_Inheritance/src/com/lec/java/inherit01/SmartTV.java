package com.lec.java.inherit01;

public class SmartTV {
	// 멤버변수
	// 기존의  BasicTV 에 만들었던 멤버들이 그대로 또 작성?
	boolean isPowerOn;
	int channel;
	int volume;
	String ip;  // <-- SmartTV 에서 새로이 추가된 필드
	
	// 메소드
	public void displayInfo() {
		
		// 기존 BasicTV 에서 만들었던 코드가 거의 그대로
		System.out.println("--- TV 현재 상태 ---");
		System.out.println("전원: " + isPowerOn);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("IP주소: " + ip); // <- SmartTV에 추가된 코드
	}
}
