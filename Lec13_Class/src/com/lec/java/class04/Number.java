package com.lec.java.class04;

public class Number {
	private int num = 100;
	
	// 생성자
	//기본생성자
	public Number() {
		super();
	}
	
	//매개변수 받느 생성자
	public Number(int num) {
		super();
		this.num = num;
	}
	
	
	//getter, setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public Number add(Number x) {
		this.num += x.num;
		return this;
	}
	
	public Number sub(Number x) {
		this.num -= x.num;
		return this;
	}
}
