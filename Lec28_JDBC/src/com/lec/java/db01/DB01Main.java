package com.lec.java.db01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
JDBC (Java DataBase Connectivity) 사용
 0. 라이브러리(jar) 추가:
  1) 이클립스 프로젝트 폴더에 libs 폴더를 생성
  2) C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6_g.jar
 파일을 libs 폴더로 복사
  3) 복사한 라이브러리를 빌드패스에 추가   
		BulidPath - Configure Build Path..
		Libraries 탭에서  [Add JARs..]   ->  위 libs 폴더의 ojdbc6_g.jar 파일 추가
		Order and Export 탭에서  우선순위 Up (권장)

 1. Oracle 연동을 위한 정보들(상수들)을 정의(세팅)
 2. JDBC 드라이버 클래스를 메모리에 로드
 3. DB와 connection(연결)을 맺음
 4. Statement 인스턴스를 생성 (SQL을 사용하기 위한 인스턴스)
 5. SQL 문장 작성(SELECT, INSERT, UPDATE, DELETE)
 6. SQL 문장을 DB 서버로 전송
 7. 실행 결과 확인
 8. 리소스 해제
*/

// er-diagram 만들기
// http://ermaster.sourceforge.net/update-site


public class DB01Main {
	
	//1. DB 연동을 위한 정보들을 정의
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	// 연결할 DB url 정
	public static final String URL = "jdbc:mysql://localhost:3306/practice?useSSL=false&serverTimezone=Asia/Seoul&allwPublickeyRetrieval=true";
	
	//	DB 사용자 정보
	public static final String USER = "root";
	public static final String PASSWORD = "dltmddnjs1";
		
	public static void main(String[] args) {
		System.out.println("DB 1 : JDBC 프로그래밍");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		//2. JDBC 드라이버 클래스를 메모리에 로드
		try {
			Class.forName(DRIVER); // 동적 클래스 로딩
			System.out.println("드라이버 클래스 로딩 성공");
			
			//3.	DB와 connection(연결) 을 맺음
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB Connect 성공");
			
			// 4. Statement 인스턴스를 생성 (SQL을 사용하기 위한 인스턴스)
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");
			
			//5. SQL문장 작성(SELECT, INSERT, UPDATE, DELETE)
			System.out.println();
			String sql_insert = "INSERT INTO test_member VALUES(100, '이승원', '1972-10-02 08:23:22')";
			System.out.println(sql_insert);
			
			// 6. SQL 문장을 DB 서버로 전송(실행)
			
			int cnt = stmt.executeUpdate(sql_insert); // 'DML' 의 경우 executeUpdate() 로 실행	
			
			// 6. SQL 문장 실행 (SELECT)
			System.out.println();
			String sql_select = "SELECT * FROM test_member";
			System.out.println(sql_select);
			
			rs = stmt.executeQuery(sql_select);
			System.out.println(cnt + "개 row(행) 이 INSERT됨");
			
			// 7. SELECT 결과 확인
			
			// 7-1 컬럼이름으로 받아오기
//			while(rs.next()) {
//				//next(). 레코드 하나 추출하고 true 리턴. 추출할 레코드 없으면 false 리턴
//				String no = rs.getString("mb_no");
//				String name = rs.getString("mb_name");
//				String birthDate = rs.getString("mb_birthdate");
//				
//				String result = no + "\t | " + name + "\t| " + birthDate;
//				System.out.println(result);
//			}
			
			// 7-2 컬럼 인덱싱으로 받기
			System.out.println();
			while(rs.next()) {
				String no = rs.getString(1);
				String name = rs.getString(2);
				String birthDate = rs.getString(3);
				String result = no + "\t | " + name + "\t| " + birthDate;
				System.out.println(result);
			}
			
			// 7-3 null처리 해주
			System.out.println();
			while(rs.next()) {
				String no = rs.getString(1);
				String name = rs.getString(2);
				if(name == null) name = "";
				String birthDate = rs.getString(3);
				String result = no + "\t | " + name + "\t| " + birthDate;
				System.out.println(result);
			}
			
			// 7-4 개별적인 타입으로 get 하기
			System.out.println();
			while(rs.next()) {
				String no = rs.getString(1);
				String name = rs.getString(2);
				if(name == null) name = "";
				
				LocalDateTime localDateTime = null;
				localDateTime = rs.getObject("mb_birthdate", LocalDateTime.class);
				
				String birthDate = "";
				if(localDateTime != null) {
					birthDate = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
				}
				String result = no + "\t | " + name + "\t| " + birthDate;
				System.out.println(result);
			}
			
			
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			//8. 리소스 해제
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}

		System.out.println("프로그램 종료");
	} // end main()

} // end class DB01Main













