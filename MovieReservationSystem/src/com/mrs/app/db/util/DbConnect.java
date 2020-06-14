package com.mrs.app.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "java";
	static String password = "1234";

	static Connection conn = null;
	static Statement stmt = null;

	public static Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); // 접속성공시 conn = 접속결과 객체 값
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩실패");
			e.printStackTrace();
		} catch (SQLException e2) {
			System.out.println("접속실패");
			e2.printStackTrace();
		}
		if (conn == null) {
			throw new SQLException();
		}
		return conn;
	}

}