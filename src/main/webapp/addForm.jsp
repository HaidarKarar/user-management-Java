<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.*" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="included/header.jsp" %>
  </head>
  <body>
  <%@include file="included/navbar.jsp" %>
    <div class="container">
    
	 	<div class="card w-50 mx-auto my-5">
	 		<div class="card-header text-center" style="background-color: grey">Add new Employee</div>
	 		<div class="card-body">
		
				<form action="AddEmp" method="post"> 
				<%Message m = (Message) session.getAttribute("msg");
				if( m != null){%>
					<div class="alert alert-<%=m.getCssClass() %>" role="alert">
	 					  <%=m.getContent() %>
	 				</div>
 				<%} %>
						
					<div class="form-group">
	 				<label>First Name</label>
	 				<input type = text class="form-control" name="fname" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Last Name</label>
	 				<input type = text class="form-control" name="lname" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Email</label>
	 				<input type = email class="form-control" name="email" required>
	 				</div>
	 				
	 				<div class="form-group">
				  		<label >Gender</label>
				  		
				  		<div class="form-check form-check-inline">
				  			<input class="form-check-input" type="radio" name = "gender" value="female">Female
						</div> 
						<div class="form-check form-check-inline">
				  			<input class="form-check-input" type="radio" name = "gender" value="male">Male
						</div> 
						
				  </div>
	 				
	 				<div class="form-group">
	 				<label>Mobile</label>
	 				<input type = text class="form-control" name="mobile" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>DOB</label>
	 				<input type = date class="form-control" name="dob" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Address</label>
	 				<input type = text class="form-control" name="add" required>
	 				</div>
				  
				  
	 				
	 				<div class="text-center">
	 				<button type="submit" class="btn btn-primary">Submit</button>
	 				</div>
			
				</form>
				</div>
	 	</div>
 	</div>
    
    
    <%@include file="included/footer.jsp" %>
</body>
</html>