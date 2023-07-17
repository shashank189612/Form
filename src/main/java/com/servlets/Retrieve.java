package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.util.Arrays;

/**
 * Servlet implementation class Retrieve
 */
@WebServlet("/Retrieve")
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	PrintWriter writer = resp.getWriter();
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	String email = req.getParameter("email");
    	int phoneno = Integer.parseInt(req.getParameter("phoneno")) ;
    	
    	Student s = new Student(username, password, email, phoneno);
    	req.setAttribute("student", s);
    	RequestDispatcher rd =  req.getRequestDispatcher("/Database");
    	rd.forward(req, resp);
    	
    	
//    	System.out.println(s);
    	
    	
    	
    	
    	}

}
