package com.tenco.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL - http://localhost:8080/blog/index.html
// URI - http://localhost:8080/blog/boardcontroller

//wdb.xml  환경설정에서 해야 되는  부분인데
// ㅈ듀.틔  파일은 웹 서버가 동작시 한번만 로딩되기 때문에 서버를 재 시작해야 한다
@WebServlet("/boardcontroller") 
public class BoradController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoradController() {
        super();
    }

    //  GET
    // http://localhost:8080/blog/boardcontroller?name=Lee
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("borardController 동작");
		System.out.println(" contextPath : " + request.getContextPath());
		System.out.println("Cookies : " + request.getCookies());
		System.out.println("Session : " + request.getSession());
		// JSESSIONID 것은 사용자가 웹 서버에 최초 요청 하고 응답시에 값을 담아서
		// 보낸다
		System.out.println("p_name : " + request.getParameterNames());
		System.out.println("test : " + request.getParameter("name"));
		
		// response 객체
		response.addCookie(new Cookie("mycookie", "asd123"));
		response.getWriter();
		response.getStatus();
		
	//	response.sendRedirect("/usercontroller");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
