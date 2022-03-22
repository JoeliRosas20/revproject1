package com.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.pms.dao.LoginDAO;
import com.training.pms.dao.LoginDAOImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginDAO loginDAO = new LoginDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//Request
		String reason = request.getParameter("reason");
		String amount = request.getParameter("amount");
		String username = request.getParameter("employeeId");
		//Update Info
		
		if(!reason.isEmpty() && !amount.isEmpty()) {
			System.out.println("True");
			submitRequest(reason, amount, username);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void submitRequest(String reason, String amount, String employee) {
		int money = Integer.parseInt(amount);
		int employeeId = Integer.parseInt(employee);
		loginDAO.submitARequest(reason, money, employeeId);
	}
	
	public void updateInfo() {
		
	}

}
