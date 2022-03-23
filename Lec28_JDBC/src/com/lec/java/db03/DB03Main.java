package com.lec.java.db03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lec.java.db.Query;

// 공통적으로 사용하는 상수들 인터페이스에 담아서 처리.
public class DB03Main implements Query {

	public static void main(String[] args) {
		System.out.println("DB 3 - PreparedStatement");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.println(SQL_SELECT_ALL);
		System.out.println(SQL_INSERT);
		System.out.println(SQL_UPDATE_BIRTHDATE);
		System.out.println(SQL_DELETE_BY_NO);
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 클래스 로딩 성공");
			
			conn =DriverManager.getConnection(URL , USER, PASSWORD);
			System.out.println("DB Connection 생성");
			
			// PreparedStatement 생성
			System.out.println();
			System.out.println("INSERT");
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt(1, 101);
			pstmt.setString(2, "이준형");
			pstmt.setString(3, "2001-06-08");
			
			int cnt = 0;
			
			cnt += pstmt.executeUpdate();
			
			pstmt.setInt(1, 103);
			pstmt.setString(2, "권현진");
			pstmt.setString(3, "1997-04-24");
			
			cnt += pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) INSERT 성공");
			
			pstmt.close();
			
			System.out.println();
			System.out.println("UPDATE");
			pstmt = conn.prepareStatement(SQL_UPDATE_BIRTHDATE);
			pstmt.setString(1, "2021-08-16");
			pstmt.setInt(2, 7);
			
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) UPDATE 성공");
			
			pstmt.close();
			
			//DELETE
			System.out.println();
			System.out.println("DELETE");
			pstmt = conn.prepareStatement(SQL_DELETE_BY_NO);
			pstmt.setInt(1, 101);
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 행(row) DELETE성공");
			
			// SELECT
			System.out.println();
			System.out.println("SELECT");
			pstmt = conn.prepareStatement(SQL_SELECT_BY_NO);
			
			pstmt.setInt(1, 7);
			
			rs = pstmt.executeQuery();
			// 7-1 컬럼이름으로 받아오기
			while(rs.next()) {
				//next(). 레코드 하나 추출하고 true 리턴. 추출할 레코드 없으면 false 리턴
				String no = rs.getString("mb_no");
				String name = rs.getString("mb_name");
				String birthDate = rs.getString("mb_birthdate");
				
				String result = no + "\t | " + name + "\t| " + birthDate;
				System.out.println(result);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end main()

} // end class DB03Main






















