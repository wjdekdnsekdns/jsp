package com.tenco.controller.DBHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHelper {
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "demo2";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "root";
	
	private Connection conn;

	private static DBHelper dbHelper;
	public static DBHelper getInstance() {
		if(dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}
	public Connection getConnection() {
			if(conn == null) {
				String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
				String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
					System.out.println(" >> DB연결 완료 << ");
				} catch (Exception e) {
					System.out.println(" >> DBHelper 에서 오류가 발생 << ");
					e.printStackTrace();
			}
		}
		return conn;
	}
	public void close() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 conn = null;
	}
}
