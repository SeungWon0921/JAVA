package com.lec.java.exception08;

// TODO : Exceptio 상속받은 예외 클래스 만들기
public class AgeInputException extends Exception{
	
	public AgeInputException() {
		super("나이를 다시 입력하세요");
	}
	public AgeInputException(String msg) {
		super(msg);
	}
	
} // end class AgeInputException
