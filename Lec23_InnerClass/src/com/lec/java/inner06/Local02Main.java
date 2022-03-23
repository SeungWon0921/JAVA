package com.lec.java.inner06;

public class Local02Main {

	public static void main(String[] args) {
		System.out.println("Local 내부 클래스의 활용");
		
		Person person = new Person("ABC");
		person.readAge(10);

		MyReadable r = person.createInstance(16);
		r.readInfo();  // 다른 클래스에서도 로컬클래스가 정의한 메소드를 사용 가능
		
	} // end main()

} // end class Local02Main














