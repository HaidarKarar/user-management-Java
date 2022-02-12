package controller;

import java.io.IOException;
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
 * Servlet implementation class DeleteEmp
 */
@WebServlet("/DeleteEmp")
public class DeleteEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id").trim());
			
			EmployeeDao empDao = new EmployeeDao(DBConn.getConnection());
			
			empDao.deleteEmp(id);
			
			
			
			//session message
			Message m = new Message("Delete successfully", "success", "danger");
			HttpSession session = request.getSession();
			session.setAttribute("msg",m);
			
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
