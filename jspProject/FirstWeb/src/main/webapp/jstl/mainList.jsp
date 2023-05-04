<%@page import="member.dao.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Member> members = new ArrayList<Member>();
	
	members.add(new Member("cool00","0000", "COOL00"));
	members.add(new Member("cool01","0000", null));
	members.add(new Member("cool02","0000", "COOL01"));
	members.add(new Member("cool03","0000", "COOL02"));
	members.add(new Member("cool04","0000", null));
	members.add(new Member("cool05","0000", null));
	members.add(new Member("cool06","0000", "COOL06"));
	members.add(new Member("cool07","0000", null));
	members.add(new Member("cool08","0000", "COOL07"));
	members.add(new Member("cool09","0000", "COOL08"));
	
	session.setAttribute("members", members);
%>






</body>
</html>