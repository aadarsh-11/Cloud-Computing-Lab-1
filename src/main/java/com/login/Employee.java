package com.login;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import com.login.dao.ReportDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Employee")
public class Employee extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		
		ReportDao rdao = new ReportDao();
		
		HttpSession session = request.getSession();
		session.setAttribute("eid", eid);
		session.setAttribute("name", rdao.getName(eid));
		session.setAttribute("dob", rdao.getDOB(eid));
		session.setAttribute("contact", rdao.getContact(eid));
		session.setAttribute("role", rdao.getRole(eid));
		int salary = Integer.parseInt(rdao.getSalary(eid))*12 + Integer.parseInt(rdao.getBonus(eid));  
		session.setAttribute("salary", salary);
		
		response.sendRedirect("employee.jsp");
	}

}
