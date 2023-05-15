<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-15
  Time: 오전 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FileUpload</title>
</head>
<body>

<h1>리포트 업로드 완료 3</h1>
<h3>Report
    이름 : ${report.snum} <br>
    학번 : ${report.sname} <br>
    파일 이름 : ${report.report.originalFilename} <br>
    첫번째 report : 커맨드 객체, <br>
    두번째 report : getReport, <br>
    세번째 : getOriginalFileName() <br>

    <a href="/report">등록으로</a>
</h3>
<img src="/uploadfile/report/${report.report.originalFilename}"/> <br>
<%--http://localhost:8080/uploadfile/report/erd.PNG --%>
</body>
</html>
