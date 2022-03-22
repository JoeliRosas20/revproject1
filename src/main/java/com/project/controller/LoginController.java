package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.pms.dao.LoginDAO;
import com.training.pms.dao.LoginDAOImpl;

/**
 * Servlet implementation class LoginController
 */
//TODO 2 Test out the LoginDAOImpl methods
//TODO 3 Add more cucumber files for reimbursements from both ends
//TODO 4 Implement the cucumber methods onto the Junit
//TODO 5 Make the site look nice with bootstrap
//TODO 1 Edit Employee view resolved and update Info, Manager view employee reimbursement request
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username", uname);
		LoginDAO loginDAO = new LoginDAOImpl();
		boolean result = loginDAO.validate(uname, pwd);
		if(result) {
			session.setAttribute("message", "Valid User");
			out.println("Welcome : " +uname+", <br/>");
			String status = loginDAO.getUserStatus(uname);
			if(status.equals("employee")) {
				RequestDispatcher dispatcher1 = request.getRequestDispatcher("EmployeeHome.jsp");
				dispatcher1.include(request, response);
			}else if(status.equals("manager")) {
				RequestDispatcher dispatcher2 = request.getRequestDispatcher("ManagerHome.jsp");
				dispatcher2.include(request, response);
			}
			out.println("<br/>");
			out.println("<a href=Login.html>Logout</a>");
		}
		else {
			out.println("That account does not exist. Go <a href=SignUp.html>Sign Up<a/>");
		}
		out.println("</body></html>");
	}

}
