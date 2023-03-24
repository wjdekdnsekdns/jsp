package com.blog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blog.DAO.DAO;
import com.blog.DTO.DTO;


@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private DTO dto = new DTO();
       private DAO dao = new DAO();
    
    public servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		
		//String name = request.getParameter("name");
		//String pwd = request.getParameter("password");
		   dto.setName(request.getParameter("name"));
		   dto.setPassword(request.getParameter("password"));
		int result = dao.userInsert(dto);
		System.out.println(" result : " + result);
		

	}

}
