package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.TodoDTO;
import com.tenco.todo.repasitory.TodoDAO;

@WebServlet("/todoTest")
public class TodoTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TodoDAO dao = new TodoDAO();
	TodoDTO dto = new TodoDTO();
    public TodoTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<TodoDTO> resultlist = dao.select();
		request.setAttribute("list", resultlist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("test2/todoTest.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		dto.setTitle(request.getParameter("title"));
		dto.setDescription(request.getParameter("description"));
		dto.setCompleted(Integer.parseInt(request.getParameter("priority")));
		dto.setPriority(Integer.parseInt(request.getParameter("completed")));
		dto.setFkcategory(Integer.parseInt(request.getParameter("category_id")));
		int result = dao.insert(dto);
		System.out.println("result : " + result);
	}

}
