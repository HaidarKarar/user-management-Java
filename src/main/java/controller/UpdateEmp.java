package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DBConn;
import dao.EmployeeDao;
import model.Employee;
import model.Message;

/**
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/UpdateEmp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id").trim());     
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String phone = request.getParameter("mobile");
		String add = request.getParameter("add");
		
		//create new emp object
		
		Employee emp = new Employee(id, fName, lName, email, gender, dob, phone, add);
		EmployeeDao eDao = new EmployeeDao(DBConn.getConnection());
		eDao.updateEmp(emp);
		
		//create message session
		
		Message m = new Message("Update successfull", "success", "success");
		HttpSession session = request.getSession();
		session.setAttribute("msg", m);
		response.sendRedirect("showEmp.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		

//		PrintWriter out = response.getWriter();
//		int id = Integer.valueOf(request.getParameter("id"));
//		String fName = request.getParameter("fname");
//		String lName = request.getParameter("lname");
//		String email = request.getParameter("email");
//		String gender = request.getParameter("gender");
//		String dob = request.getParameter("dob");
//		String phone = request.getParameter("mobile");
//		String add = request.getParameter("add");
//		
//		//create new emp object
//		
//		Employee emp = new Employee(id, fName, lName, email, gender, dob, phone, add);
//		out.println(emp);
	}

}
