package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportDao {
	String username = "postgres";
	String password = "password";
	String url = "jdbc:postgresql://localhost:5432/Cloud-Computing-WebApp";
	
	public String getName(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_details where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(3) + " " + rs.getString(4);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String getDOB(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_details where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(5);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String getContact(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_details where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(6);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String getRole(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_salary where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(2);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	public String getSalary(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_salary where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(3);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "0";
	}
	
	public String getBonus(String eid)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM employee_salary where eid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, eid);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getString(4);
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return "0";
	}
}
