<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="included/header.jsp" %>
  </head>
  <body>
  <%@include file="included/navbar.jsp" %>


	<h1>Welcome page</h1>
	
	<a href="<%=request.getContextPath()%>/showAllEmp" class="nav-link">Show all data</a>

 <%@include file="included/footer.jsp" %>
</body>
</html>