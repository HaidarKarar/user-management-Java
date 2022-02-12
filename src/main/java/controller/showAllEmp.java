package controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DBConn;
import dao.EmployeeDao;
import model.Employee;

/**
 * Servlet implementation class showAllEmp
 */
@WebServlet("/showAllEmp")
public class showAllEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showAllEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//create new emp list
			List<Employee> emp_list = new ArrayList<>();
			EmployeeDao empDao = new EmployeeDao(DBConn.getConnection());  //create empDao object
			emp_list = empDao.getAllEmp();
			
			//set session
			HttpSession session = request.getSession();
			session.setAttribute("email", emp_list);
						
			response.sendRedirect("showEmp.jsp");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
//		
	}

}
