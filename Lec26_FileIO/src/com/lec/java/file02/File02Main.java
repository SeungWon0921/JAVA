package com.lec.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* FileIO
 Program <=== InputStream <=== Source
 Program ===> OutputStream ===> Source
 Program <=== FileInputStream <=== File
 Program ===> FileOutputStream ===> File

 java.io.InputStream
  |__ java.io.FileInputStream: 파일로부터 데이터를 읽어오는 통로
 java.io.OutputStream
  |__ java.io.FileOutputStream: 파일로 데이터를 쓰는 통로
*/

public class File02Main {

	public static void main(String[] args) {
		System.out.println("File IO");

		InputStream in = null;
		OutputStream out = null;
		
		try {
		in = new FileInputStream("temp/big_text.txt");
		
		out = new FileOutputStream("temp/copy_big_text.txt");
		
		int dataRead;
		while(true) {
			// 데이터 읽기: InputStream에 있는 read() 메소드 사용
			// read()는 InputStream 으로부터 
			// 1byte 씩 읽어서 int(4byte) 에 담아 리턴한다
			// [ ... ][ ... ][ ... ][ 1byte ]
			dataRead = in.read();
			if(dataRead == -1) {
				break;
			}
			out.write(dataRead);
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(out != null) out.close();
				if(in != null) in.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n프로그램 종료");
		
	} // end main()

} // end class

