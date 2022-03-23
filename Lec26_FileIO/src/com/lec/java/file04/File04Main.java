package com.lec.java.file04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 보조스트림 (filter stream)
Program <=== FilterInputStream <=== InputStream <=== Source
					↓ 상속					↓ 상속
Program <=== BufferedInputStream <=== FileInputStream <=== File

Program ===> FilterOutputStream ===> OutputStream ===> Source
					↓ 상속					↓ 상속
Program ===> BufferedOutputStream ===> FileOutputStream ===> File

java.io.InputStream
 |__ java.io.FilterInputStream
      |__ java.io.BufferedInputStream

java.io.OutputStream
 |__ java.io.FilterOutputStream
      |__ java.io.BufferedOutputStream

참고 ) 보조스트림 (filter stream)
보조스트림(filter stream) 이란 다른 스트림과 연결되어 여러가지 편리한 기능을 제공해주는 스트림
*/

public class File04Main {

	public static void main(String[] args) {
		System.out.println("BufferedInputStream, BufferedOutputStream");

		InputStream in = null; 
		BufferedInputStream bin = null;
		OutputStream out = null;
		BufferedOutputStream bout = null;
		
		try {
			// FileInputStream 인스턴스 생성
			in = new FileInputStream("temp/big_text.txt");
			bin = new BufferedInputStream(in); // 장착!
			
			// FileOutputStream 인스턴스 생성
			// 해당 파일이 없으면, 새로생성.
			//  ..     있었으면, 지우고 새로생성.
			out = new FileOutputStream("temp/copy_big_text.txt");
			bout = new BufferedOutputStream(out);  // 장착!
			
			// in.read() 대신에 bin.read() 를
			// out.write() 대신에 bout.write() 를 사용하면 된다.
			// finally 꼭!
			
			// 파일복사
			int dataRead;
			int byteCopied = 0;
			long startTime = System.currentTimeMillis();   // 현재 시간 저장
			while(true) {	
				dataRead = bin.read();
				if(dataRead == -1) {
					break;
				}
				
				bout.write(dataRead);
				byteCopied++;
			} // end while
			
			long endTime = System.currentTimeMillis(); // 끝난 시간 저장 
			long elapsedTime = endTime - startTime; // 경과 시간
			
			System.out.println("읽고 쓴 바이트: " + byteCopied);
			System.out.println("경과 시간(ms): " + elapsedTime);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 리소스 해제
			try {
				if(bout != null) bout.close();
				if(bin != null) bin.close();
				// bin 을 close() 하면 bin 이 장착된 in 도 함께 close된다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class














