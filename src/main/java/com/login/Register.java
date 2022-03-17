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
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass"); 
		String fname = request.getParameter("fname"); 
		String lname = request.getParameter("lname"); 
		String email = request.getParameter("email"); 
		
		RegisterDao dao = new RegisterDao();
		
		if(dao.register(uname, pass, fname, lname, email))
		{			
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("register.jsp");
		}
	}

}
