<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% 
    	String id= request.getParameter("id");
    	String pw= request.getParameter("pw");
    	
    	if(id != null && pw != null){
    		
    		if(id.equals("admin") && pw.equals("1234")){
    			session.setAttribute("id", id);
    			response.sendRedirect("index2.jsp");
    		}else{
    			out.print("<p>로그인 실패</p>");
    		}
    		
    	}
    	
    %>