package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.DAO.EmployeeDAO;
import com.mindgate.pojo.Employee;


@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
    private String name;
    private double salary;
    private PrintWriter out;
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private boolean result;
    

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = response.getWriter();
		name = request.getParameter("EmploName");
		salary= Double.parseDouble(request.getParameter("Salary"));
		
		out.println("name ::"+name);
		out.println("salary::"+ salary);
		
		Employee employee = new Employee(0, name, salary);
		
		result = employeeDAO.addEmployee(employee);
		
		response.setContentType("text/html");
		
		if(result) {
			out.print("Record added successfully");
			out.println("<a href = employeehome.html>Home page</a>");
		}
			
			else {
				out.print("failed to add record");
			out.println("<a href = employeehome.html>Home page</a>");
		
		}


		
		
	}

}
