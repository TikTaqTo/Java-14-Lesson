<%@ page import="com.example.jelaba.models.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    Object student = (Student) request.getAttribute("student");
%>
<h1><%=student.toString()%></h1>
<br/>
</body>
</html>