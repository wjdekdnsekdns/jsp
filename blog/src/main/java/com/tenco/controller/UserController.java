package com.tenco.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usercontroller")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 2.
		// JSON 형식으로 name = 홍길동, age=10 이라는 값을 리턴 시키세요
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; chartset = utf-8;");
		PrintWriter writer = response.getWriter();
		writer.print(
				 "	{ "
				+ "	\"name\" : \"홍길동\", "
				+ "	\"age\" : 10 "
				+ "	}");
	}

	// Method : post
	// http://localhost8080/blog/usercontroller
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// form 태그에서 넘어오는 값들을 받아보고 연산을해서 응답 처리 해보기
		// 요청시 파라미터로 넘겨온 키값을 확인해서 값을 추출하는 기술을 알아보자
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");

		System.out.println("name : " + name);
		System.out.println("password : " + pwd);

		// 응답처리 -->
		// 1. MIME TYPE text/html 방식 -> 이름과 비번을 확인 하였습니다
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
	}

}
