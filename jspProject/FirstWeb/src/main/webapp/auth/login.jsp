<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String method = request.getMethod();
	//out.println(method);
	
	if (method.equals("GET")){
		response.sendRedirect("login_form.jsp");
	} else {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		if(userid.equals(password)){
			response.sendRedirect("mypage.jsp");
		}else {
			response.sendRedirect("login_form.jsp");
		}
	}

%>
