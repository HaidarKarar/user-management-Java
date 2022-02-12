<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.*" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<%@include file="included/header.jsp" %>
  </head>
  <body>
  <%@include file="included/navbar.jsp" %>
  
  <div class="container">
    
	 	<div class="card w-50 mx-auto my-5">
	 		<div class="card-header text-center" style="background-color: grey">Login Form</div>
	 		<div class="card-body">
	 		
	 			<form action="Login" method="post">
	 			
	 			
	 				<%//set message session
	 				Message m = (Message) session.getAttribute("msg");
	 				if (m != null){%>
	 				
	 					<div class="alert alert-<%=m.getCssClass() %>" role="alert">
	 					  <%=m.getContent() %>
	 				</div>
	 				<%}
	 				session.removeAttribute("msg");
	 				%>
	 				<div class="form-group">
	 				<label>Email</label>
	 				<input type = email class="form-control" name="email" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Password</label>
	 				<input type = password class="form-control" name="password" placeholder="*******" required>
	 				</div>
	 				
	 			 				
	 				
	 				<div class="text-center">
	 				<button type="submit" class="btn btn-primary">Submit</button>
	 				</div>
	 				
	 				<p>Not a member ?
	 				 	<a href = "registration.jsp">Signup now</a>
	 				</p>
	 			</form>
	 		</div>
	 	</div>
 	</div>
    
    
    
  <%@include file="included/footer.jsp" %>

</body>
</html>