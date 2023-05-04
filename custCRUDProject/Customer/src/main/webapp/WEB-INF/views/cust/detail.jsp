<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>고객 상세 페이지</title>
</head>
<body>

<h1>고객 상세 정보 </h1> <h3><a href="list">홈으로</a></h3><br>
<h3>로그인중 : ${loginInfo.name }</h3>
<hr>

${cust.custid }. ${cust.name } / ${cust.address } / ${cust.phone } <br>


<a href="update?custid=${cust.custid }">수정</a> 

<form action="delete" method="post">
	<input type="hidden" name="custid" value="${cust.custid }">
	<input type="submit" value="삭제">
</form>

</body>
</html>