<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="model.*" %>  
    <%@page import="dao.*" %> 
    <%@page import="java.io.PrintWriter"%>
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
	 		<div class="card-header text-center" style="background-color: grey">Update Employee</div>
	 		<div class="card-body">
	 		
	 		<% 
	 		int id = Integer.parseInt(request.getParameter("id"));   
	 		
	 		EmployeeDao eDao  = new EmployeeDao(DBConn.getConnection());
	 		Employee e = eDao.selectById(id);	
	 		%>
		
				 <form action="UpdateEmp" method="post">
					<input type = hidden class="form-control" name="id" value="<%=e.getId() %>" required>
						
					<div class="form-group">
	 				<label>First Name</label>
	 				<input type = text class="form-control" name="fname" value="<%=e.getFirstName() %>" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Last Name</label>
	 				<input type = text class="form-control" name="lname" value="<%=e.getLastName() %>" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Email</label>
	 				<input type = email class="form-control" name="email" value="<%=e.getEmail() %>" required>
	 				</div>
	 				
	 				<div class="form-group">
				  		<label >Gender</label>
				  		<input type =text class="form-control" name="" value="<%=e.getGender() %>" required> 
						
				  </div>
	 				
	 				<div class="form-group">
	 				<label>Mobile</label>
	 				<input type = text class="form-control" name="mobile" value="<%=e.getPhone() %>" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>DOB</label>
	 				<input type = date class="form-control" name="dob" value="<%=e.getDob() %>" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Address</label>
	 				<input type = text class="form-control" name="add" value="<%=e.getAddress() %>" required>
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