package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetailsServlet")
public class AcceptDetailsServlet extends HttpServlet {
	private PrintWriter printWriter;
	private  double Number1;
	private double Number2;
	private double result ;
       
   
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Number1= Double.valueOf(request.getParameter("txtNo1"));
		Number2 = Double.parseDouble(request.getParameter("txtNo2"));
		result =  Number1 + Number2;
		printWriter = response.getWriter();
		printWriter.println("Addition of "+ Number1 + "and "+ Number2 + result);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Number1= Double.valueOf(request.getParameter("txtNo1"));
		Number2 = Double.parseDouble(request.getParameter("txtNo2"));
		result =  Number1 + Number2;
		printWriter = response.getWriter();
		printWriter.println("Addition of "+ Number1 + "and "+ Number2 + result);
		
	}

}
