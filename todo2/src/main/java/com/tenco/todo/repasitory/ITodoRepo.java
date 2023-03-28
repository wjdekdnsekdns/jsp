package com.tenco.todo.repasitory;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {

	ArrayList<TodoDTO> select();
	int insert(TodoDTO dto);
	void update();
	void delete();
}
