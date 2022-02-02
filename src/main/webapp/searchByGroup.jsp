<%@ page import="java.util.Objects" %>
<%@ page import="com.example.jelaba.models.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Input student group for search</h1>
<form method="get" action="/getStudent">
    <label>Input value</label>
    <input name="group" type="text">
    <button>Sent</button>
</form>
<br/>
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