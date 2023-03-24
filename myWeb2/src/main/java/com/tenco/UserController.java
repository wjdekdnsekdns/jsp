package com.tenco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/uc")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserController() {
        super();
        System.out.println("UserController 생성자 호출");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("UserController doGet 메서드 호출~");
		 PrintWriter out = response.getWriter();
		 // HTTP 메세지 - http 메세지 헤더 정의가 된다
		 // ContentType --> text/html, application/json
		 //ContentType 이란 응답 보낼 데이터 타입에 형식이다
		 // 웹 표준 기술인 MIME TYPE 이런것이 정해져 있다
		 response.setContentType(getServletInfo());
	}
	
	// 주소 경로는 똑같지만 METHOD 선정에 따라 구분할 수 있다 --> 서버는
	// http://localhost:8080/myWeb2/uc
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MERHOD 방식 중 POST 요청 방식을 확인하고 응답 처리해보자");
		// MIME TYPE : text/plain
		// Mike 문자열을 응답 처리 해주세요
		// doPost 동작 시키시 위해서는 Method : post 방식을 이해 해야 한다
		request.setCharacterEncoding("UTF-8");
		// 응답처리
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; chartset = utf-8;");
		// response.getWriter(); --> 뽑고 난 다음에 수정해서 변경이 안됐음 
		PrintWriter writer = response.getWriter();
		writer.print("홍길동");
	}

}
