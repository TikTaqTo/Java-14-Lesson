<%@ page import="com.example.jelaba.models.Student" %>
<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Students</h1>
<a href="/searchByName">Search by name</a>
<a href="/searchByGroup">Search by group</a>
<a href="/searchByYear">Search by year of admission</a>
<%
    Object student = (Student) request.getAttribute("student");
    if(Objects.nonNull(student)) {
%>
<h1><%=student.toString()%></h1>
<%
    }
%>
</body>
</html>