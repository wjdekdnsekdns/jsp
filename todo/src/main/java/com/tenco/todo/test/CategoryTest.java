package com.tenco.todo.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.todo.dto.CategoryDTO;
import com.tenco.todo.repasitory.CategoryDAO;

@WebServlet("/cTest")
public class CategoryTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
//		// DB연결 후 삭제 예정
//		DBHelper dbHelper = new DBHelper();
//		dbHelper.getConnection(); // DB 연결 완료
	}

	public CategoryTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		CategoryDAO dao = new CategoryDAO();
		// 주소설계
		// http://localhost:8080/todo/cTest?action=delete&cid=1
		String action = request.getParameter("action");
		if ("delete".equals(action)) {
			String cid = request.getParameter("cid");
			dao.delete(Integer.parseInt(cid));
			response.sendRedirect("/todo/cTest");
		} else {
			
			ArrayList<CategoryDTO> resultlist = dao.select();
			// a 링크 <--- get
			// 문제
			// 목적리 list2 -> jstl 사용해서 출력
			
			request.setAttribute("list", resultlist);
			request.getRequestDispatcher("test/categoryList.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");

		CategoryDAO dao = new CategoryDAO();

		// 쿼리 파라메터 방식 데이터 받아 보기
		// insert, update
		String action = request.getParameter("action");
		int responseCount = 0;
		if (action.equals("update")) {
			String id = request.getParameter("id");
			// id ---> String --> int
			responseCount = dao.update(Integer.parseInt(id), name);
		} else if (action.equals("insert")) {
			responseCount = dao.insert(name);
		}
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.print("저장된 갯수 확인 : " + responseCount);
	}
}
