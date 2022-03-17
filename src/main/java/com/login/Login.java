package com.login;

import java.io.IOException;

import com.login.dao.LoginDao;
import com.login.dao.ReportDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eid = request.getParameter("eid");
		String pass = request.getParameter("pass"); 
		
		LoginDao dao = new LoginDao();
		ReportDao rdao = new ReportDao();
		
		if(dao.check(eid, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("eid", eid);
//			session.setAttribute("name", rdao.getName(eid));
//			session.setAttribute("dob", rdao.getDOB(eid));
//			session.setAttribute("contact", rdao.getContact(eid));
//			session.setAttribute("role", rdao.getRole(eid));
//			session.setAttribute("salary", rdao.getSalary(eid));
//			session.setAttribute("bonus", rdao.getBonus(eid));
			
			response.sendRedirect("report.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
	}
}
