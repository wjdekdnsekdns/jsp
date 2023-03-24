package com.tenco.controller.DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tenco.controller.DTO.DTO;
import com.tenco.controller.db.DBHelper;

public class DAO {

	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet rs;
	
	public DAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	public int userInsert(DTO dto) {
		String qurey = " INSERT INTO ex(name,password) "
				+ " VALUES (?,?) ";
		int resultRow = 0;
		try {
			pstmt = conn.prepareStatement(qurey);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPassword());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultRow;
		
	}
	
	
	
	
	
}
