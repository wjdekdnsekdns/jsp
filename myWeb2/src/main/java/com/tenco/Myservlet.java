package com.tenco;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ms")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Myservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	System.out.println("contentType : " + request.getContentType());
	
	// 응담 response 객체를 사용하면 된다
	PrintWriter out = response.getWriter();
	response.setContentType("text/html; charset = utf-8;");
	out.print("<!DOCTYPE html>");
	out.print("<html>");
	out.print("<head>");
	out.print("<body>");
	out.print("<section>");
	out.print("<p style = \" color: red\">");
	out.print("HelloFirst Servlet");
	out.print("</p>");
	out.print("</section>");
	out.print("</body>");
	out.print("</head>");
	out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

}
