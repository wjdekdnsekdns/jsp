package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tenco.controller.DAO.Dao;
import com.tenco.controller.DTO.Dto;

@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Dto dto = new Dto();
	Dao dao = new Dao();
	public LoginProc() {
		super();
	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// method : POST(form 태그에서)
	// http://localhost:8080/demo2/loginProc
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// form --> 반드시 속성 name = "email" -> value = "a@naver.com"
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String isRemember = request.getParameter("isRemember");
		String hobby = request.getParameter("hobby");
		String[] likes = request.getParameterValues("like"); // 배열처리 (다중 선택)
		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("isRemember : " + isRemember);
		System.out.println("hobby : " + hobby);
		if (likes != null) {
			for (String like : likes) {
				System.out.println("like : " + like);
			}
		}
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		
		dto.setEmail(request.getParameter("email"));
		dto.setPassword(request.getParameter("password"));
		dto.setHobby(request.getParameter("hobby"));
		dto.setAnimal(request.getParameter("animal"));
		int result = dao.userInsert(dto);
		System.out.println(" result : " + result);
	}
}
