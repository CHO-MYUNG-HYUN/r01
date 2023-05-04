<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원정보 수정 화면</title>
</head>
<body>

<h1>회원 정보 수정하기</h1>
<hr>
<form method="post">
custid	: <input type="text" name="custid" value="${cust.custid }"readonly> <br>
name	: <input type="text" name="name" value="${cust.name }"> <br>
address	: <input type="text" name="address" value="${cust.address }"> <br>
phone	: <input type="text" name="phone" value="${cust.phone }"> <br>
<input type="submit" value="수정완료">
</form>
</body>
</html>