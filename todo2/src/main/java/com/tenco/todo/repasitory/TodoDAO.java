package com.tenco.todo.repasitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.utils.DBHelper;

public class TodoDAO implements ITodoRepo{
	private DBHelper dbHelper;
	private Connection conn;
	public TodoDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	@Override
	public ArrayList<TodoDTO> select() {
		
		ArrayList<TodoDTO> list = new ArrayList<>();
		
		String strQuery = " SELECT * FROM todolist ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(strQuery);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int priority = rs.getInt("priority");
				int completed = rs.getInt("completed");
				int fkcategory = rs.getInt("fkcategory");
				Timestamp createdAt = rs.getTimestamp("createdAt");
				TodoDTO dto = new TodoDTO(id, title, description, priority, completed, createdAt,fkcategory);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

	@Override
	public int insert(TodoDTO dto) {
		int resultcount = 0;
		String strQuery = " INSERT INTO todolist(title, description, priority, completed ,category_id) "
				+ " VALUES( ? , ? , ? , ? , ? ) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(strQuery);
			
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getDescription());
			pstmt.setInt(3, dto.getPriority());
			pstmt.setInt(4, dto.getCompleted());
			pstmt.setInt(5, dto.getFkcategory());
			resultcount = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultcount;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
