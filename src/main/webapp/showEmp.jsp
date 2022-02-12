<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.util.*" %>  
 <%@page import="model.*" %>  
 <%@page import="dao.*" %> 
 
 
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
  		<h3 class="text-center">List of Employee</h3>
  		
  		<% 
  	//set session
		//HttpSession session = request.getSession();
		//session.setAttribute("user", emp_list);
  		
  	//access session
		List<Employee> emp_list = (List<Employee>) session.getAttribute("email");
  		
  	
  	
  		if(emp_list != null){
  			session.setAttribute("email", emp_list);
  		} 
  		
  		//access session message
  		Message m = (Message) session.getAttribute("msg");
  		if (m != null){%>
  		
  			<div class="alert alert-<%=m.getCssClass() %>" role="alert">
	 					  <%=m.getContent() %>
			</div>

  		<%}%>
  		
  		<table class="table table-bordered">
  		
  			<thead>
                <tr>
                    <th>ID</th>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Email</th>
                    <th>Gender</th>
                    <th>DOB</th>
                    <th>Phone</th>
                    <th>Address</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
            <%
            if(emp_list != null){
            	for(Employee e: emp_list){ %>
            
           		<tr>
            		<th><%=e.getId() %></th>
                    <th><%=e.getFirstName() %></th>
                    <th><%=e.getLastName() %></th>
                    <th><%=e.getEmail() %></th>
                    <th><%=e.getGender() %></th>
                    <th><%=e.getDob() %></th>
                    <th><%=e.getPhone() %></th>
                    <th><%=e.getAddress() %></th>
                    <th>
                    	<a href = "updateForm.jsp?id=<%=e.getId() %>">Edit</a>
                    	&nbsp;&nbsp;&nbsp;&nbsp; 
                    	<a href = "DeleteEmp?id=<%=e.getId() %>">Delete</a>
					</th>
                    
                  </tr>
                  
                 <%} 
                 }%>
            </tbody>
  		</table>
  </div>
  
  
  <%@include file="included/footer.jsp" %>

</body>
</html>