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
 * Servlet implementation class AddEmp
 */
@WebServlet("/AddEmp")
public class AddEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			String fName = request.getParameter("fname");
			String lName = request.getParameter("lname");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String dob = request.getParameter("dob");
			String phone = request.getParameter("mobile");
			String add = request.getParameter("add");
			
			//create new emp object
			Employee emp = new Employee(fName, lName, email, gender, dob, phone, add);
			EmployeeDao  eDao = new EmployeeDao(DBConn.getConnection());
			eDao.addEmp(emp);
			
			//Add mess session
			Message m = new Message("Add new employee successfully", "success", "success");
			HttpSession session = request.getSession();
			session.setAttribute("msg", m);
			response.sendRedirect("showEmp.jsp");
		
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
