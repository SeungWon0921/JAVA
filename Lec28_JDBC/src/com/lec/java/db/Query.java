package com.lec.java.db;

public interface Query {
	//1. DB 연동을 위한 정보들을 정의
		public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		// 연결할 DB url 정
		public static final String URL = "jdbc:mysql://localhost:3306/practice?useSSL=false&serverTimezone=Asia/Seoul&allwPublickeyRetrieval=true";
		
		//	DB 사용자 정보
		public static final String USER = "root";
		public static final String PASSWORD = "dltmddnjs1";
		
		public static final String SQL_SELECT_ALL =
				"SELECT * FROM test_member";
		
		public static final String SQL_SELECT_BY_NO =
				"SELECT * FROM test_member WHERE mb_no < ?";
		
		public static final String SQL_INSERT =
				"INSERT INTO test_member VALUES(?,?,?)";
		public static final String SQL_UPDATE_BIRTHDATE = 
				"UPDATE test_member " 
				+ " SET mb_birthdate = ? "
				+ " WHERE mb_no = ? ";
		
		public static final String SQL_DELETE_BY_NO =
				"DELETE FROM test_member "
				+ "WHERE mb_no = ?";
				

} // end Query(I)
