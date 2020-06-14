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
			conn = DriverManager.getConnection(url, user, password); // ���Ӽ����� conn = ���Ӱ�� ��ü ��
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��ε�����");
			e.printStackTrace();
		} catch (SQLException e2) {
			System.out.println("���ӽ���");
			e2.printStackTrace();
		}
		if (conn == null) {
			throw new SQLException();
		}
		return conn;
	}

}