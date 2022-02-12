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
import dao.UserDao;
import model.Message;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
//			out.println(email + password);
			
			//create user and userDao object
			User user = new User();
			UserDao uDao = new UserDao(DBConn.getConnection());
			user = uDao.loginUser(email, password);
			
			if(user != null) {
				//set session for user
				HttpSession session  = request.getSession();
				session.setAttribute("user", user);
				
				response.sendRedirect("index.jsp");
			}else {
				
				Message m = new Message("Login failed", "error", "danger");
				//set session for message
				HttpSession session = request.getSession();
				session.setAttribute("msg", m);
				
				
				response.sendRedirect("login.jsp");
			}
			
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
