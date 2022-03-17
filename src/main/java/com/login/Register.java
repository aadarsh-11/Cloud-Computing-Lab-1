package com.login;

import java.io.IOException;

import com.login.dao.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String pass = request.getParameter("pass"); 
		String fname = request.getParameter("fname"); 
		String lname = request.getParameter("lname"); 
		String dob = request.getParameter("deb"); 
		String contact = request.getParameter("contact"); 
		String role = request.getParameter("role"); 
		String salary = request.getParameter("salary"); 
		String bonus = request.getParameter("bonus"); 
		
		RegisterDao dao = new RegisterDao();
		
		if(dao.register(eid, pass, fname, lname, dob,contact,role,salary,bonus))
		{			
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
	}

}
