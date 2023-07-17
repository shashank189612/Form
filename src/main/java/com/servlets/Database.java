package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Database
 */
@WebServlet("/Database")
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
		private String url ="jdbc:mysql://localhost:3306/academy";
		private String  user ="root";
		private String password = "1234";
		private Connection mycon ; 
		
		
		
		private String sql = "INSERT INTO student(username, password, email, phoneno) values(?,?,?,?)";
				
		
	
       
	public void init() throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.mycon = DriverManager.getConnection(url, user, password);
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student  s =(Student) req.getAttribute("student");
		
		
		try {
			
			PrintWriter writer = resp.getWriter();
			PreparedStatement pstmt = this.mycon.prepareStatement(sql);
			pstmt.setString(1,s.getName());
			pstmt.setString(2, s.getPassword());
			pstmt.setString(3, s.getEmail());
			pstmt.setInt(4,s.getPhoneno());
			
			
			int flag = pstmt.executeUpdate();
			
			writer.println("<h1>"+s.getName()+" welcome to the academy "+"</h1>");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
