
<%@page import="model.*" %>  


<nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">

  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">E-commerce shopping cart</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <%User u = (User) session.getAttribute("user"); %>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      
      <ul class="navbar-nav ml-auto mb-2 mb-lg-0">
      
      	
     <%if (u == null){ %>
        
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="login.jsp">Login</a>
        </li>
        <li class="nav-item">
        	<a class="nav-link" href="registration.jsp">Register</a>
      </li>
      <%}else{ %>
      		<li class="nav-item">
         		 <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/showAllEmp">Home</a>
       		 </li>
      
	        <li class="nav-item">
	        <a class="nav-link" href="addForm.jsp">Add Employee
	        	<span class = "badge badge-danger"></span>
	        </a>
	      </li>    
	        
	      <li class="nav-item">
	          <a class="nav-link" href="Logout">Logout</a>
        	</li>
       	
        <%} %>
      
     
      </ul>
   
    </div>
  </div>
</nav>


