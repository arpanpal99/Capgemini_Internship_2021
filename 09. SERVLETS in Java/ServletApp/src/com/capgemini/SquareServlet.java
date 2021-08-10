package com.capgemini;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
//		Using "RequestDispatcher" object
//		response.getWriter().println("Welcome to SquareServlet");
//		int sumFromAddServlet = (int) request.getAttribute("sum");
//		int sq = sumFromAddServlet * sumFromAddServlet;		
//		response.getWriter().println("\nSum = " + sumFromAddServlet + "\nSquare of sum = " + sq);
		
//		Using "sendRedirect" object
		response.getWriter().println("Welcome to SquareServlet");
		int sumFromAddServlet = Integer.parseInt(request.getParameter("sum"));
		int sq = sumFromAddServlet * sumFromAddServlet;		
		response.getWriter().println("\nSum = " + sumFromAddServlet + "\nSquare of sum = " + sq);
		

		
			
		
	}
	
}