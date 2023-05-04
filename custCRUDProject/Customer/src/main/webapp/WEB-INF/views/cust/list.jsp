<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>리스트 목록</title>
</head>
<body>

<h1>고객 리스트 </h1> <br>
<h3>로그인중 : ${loginInfo.name }</h3>
<hr>
	<ul>
		<c:forEach items="${custList }" var="cust">
			<li><a href="${pageContext.request.contextPath }/cust/detail?custid=${cust.custid}">${cust.custid }. ${cust.name }</a></li>
		</c:forEach>
	</ul>
	
	<a href="insert">고객 등록</a>
	<c:if test="${loginInfo.custid eq null }">
	<a href="login">로그인</a>
	</c:if>
	
	<c:if test="${loginInfo.custid ne null }">
	<a href="logout">로그아웃</a>
	</c:if>
	
	
</body>
</html>