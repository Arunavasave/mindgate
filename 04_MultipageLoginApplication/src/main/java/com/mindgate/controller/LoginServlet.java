package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
       private PrintWriter out;
       private String id;
       private String password;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		id = request.getParameter("loginId");
		password = request.getParameter("Loginpassword");
	
		if(id.equals("admin") && password.equals("admin@123")) {
			response.sendRedirect("success.html");
			
			
		}
		else {
			response.sendRedirect("failure.html");
			
			
		}
		
	}

}
