<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.*" %> 
    <%@page import="java.sql.Connection" %> 
    
    
<!doctype html>
<html lang="en">
  <head>
    <title>Registration!</title>
    <%@include file="included/header.jsp" %>
  </head>
  <body>
  <%@include file="included/navbar.jsp" %>
    <div class="container">
    
	 	<div class="card w-50 mx-auto my-5">
	 		<div class="card-header text-center" style="background-color: grey">Registration Form</div>
	 		<div class="card-body">
	 		
	 		
	 			<form action="Registration" method="post">
	 				<div class="form-group">
	 				<label>Name</label>
	 				<input type = text class="form-control" name="name" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Email</label>
	 				<input type = email class="form-control" name="email" required>
	 				</div>
	 				
	 				<div class="form-group">
	 				<label>Password</label>
	 				<input type = password class="form-control" name="password" placeholder="*******" required>
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
					    <label >City</label>
					    <select name = "city">
					      <option value="hanoi">HaNoi</option>
					      <option value="hcm">HCM</option>
					      <option value="sydney">Sydney</option>
					      <option value="mel">Melburne</option>
					      <option value="bris">Brisbane</option>
						   <option value="adl">Adelaide</option>   
					    </select>
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