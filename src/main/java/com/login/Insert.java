package com.login;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import com.login.dao.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String role = request.getParameter("role"); 
		String salary = request.getParameter("salary"); 
		String bonus = request.getParameter("bonus"); 
		
		RegisterDao dao = new RegisterDao();
		
		dao.update(eid, role, salary, bonus);
		
		response.sendRedirect("report.jsp");
	}

}
