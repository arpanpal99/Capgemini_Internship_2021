package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void /*service*/ doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		If we want only post request use 'doPost' method instead of 'service'
//		If we want only get request use 'doGet' method instead of 'service'
//		---------------------------------------------------------------------
		
		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		int sum = n1 + n2;
		System.out.println("Sum is : " + sum);
		
//		Show the output message in browser
//		----------------------------------
		PrintWriter ans = res.getWriter();		
		ans.println("Sum is : " + sum);
		
//		Calling another Servlet to pass data: "Request Dispatcher"
//		---------------------------------------------
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		req.setAttribute("sum", sum);
//		rd.forward(req, res);
		
//		Redirect the user to call another servlet to pass data: Session, Cookies & URL-Rewriting
//		Session Management (URL-Rewriting) & "sendRedirect"
//		----------------------------------------------------------------------------------------
		res.sendRedirect("sq?sum=" + sum);
		
		
		
	}

}
