<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    String apple = request.getParameter("apple");
    String banana= request.getParameter("banana");
    String peach = request.getParameter("peach");
    Cookie[] cks = request.getCookies();
    	Cookie cookie1 = new Cookie("apple", apple);
    	Cookie cookie2 = new Cookie("banana", banana);
    	Cookie cookie3 = new Cookie("peach", peach);
    	
   for(int i = 0; i < cks.length; i++){
	   cks[i].getName();
	    if(apple != null){
	    	cookie1.setMaxAge(60); 
			response.addCookie(cookie1);
	    }else if(banana != null){
	    	cookie2.setMaxAge(60); 
			response.addCookie(cookie2);
	    }else if(peach != null){
	    	cookie3.setMaxAge(60); 
			response.addCookie(cookie3);
	    }
   }

   String[] fruits = request.getParameterValues("fruit");
   String[] names = {"사과", "바나나","복숭아"};
   if(fruits != null && fruits.length > 0){
	   for(String fruit : fruits){
		   cookie1.setMaxAge(60); 
			response.addCookie(cookie1);
	   }
   }
 //  if(isDelete != null){
	   
 //  }
    
    %>