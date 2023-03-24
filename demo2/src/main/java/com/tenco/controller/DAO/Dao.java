package com.tenco.controller.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tenco.controller.DBHelper.DBHelper;
import com.tenco.controller.DTO.Dto;


public class Dao {
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public Dao() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	public int userInsert(Dto dto) {
		int resultRow = 0;
		try {
			String qurey = " INSERT INTO customer (email, password, hobby, animal) "
					+ " VALUES (?,?,?,?) ";
			pstmt = conn.prepareStatement(qurey);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getHobby());
			pstmt.setString(4, dto.getAnimal());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultRow;
	}
}


