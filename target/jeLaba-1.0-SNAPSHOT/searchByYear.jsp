<%@ page import="java.util.Objects" %>
<%@ page import="com.example.jelaba.models.Student" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Input student year of admission for search</h1>
<form method="get" action="/getStudent">
    <label>Input value</label>
    <label>
        <input name="year" type="text">
    </label>
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