package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.pms.dao.LoginDAO;
import com.training.pms.dao.LoginDAOImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
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
		LoginDAO loginDAO = new LoginDAOImpl();
		boolean result = loginDAO.validate(uname, pwd);
		if(result) {
			out.println("Welcome : " +uname+", ");
		}
		else {
			out.println("That account does not exist. Go <a href=SignUp.html>Sign Up<a/>");
		}
		out.println("</body></html>");
	}

}
