package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterDao {
	String username = "postgres";
	String password = "password";
	String url = "jdbc:postgresql://localhost:5432/Cloud-Computing-WebApp";
	
	public boolean register(String eid, String pass, String fname, String lname, String dob, String contact, String role, String salary, String bonus)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            
            String sql = "INSERT into Employee_Details values('" + eid + "' ,'" + pass  + "','"  + fname + "' ,'" + lname + "','" + dob + "','" + contact + "' )";
            
            Statement stmt = con.createStatement();
            int x = stmt.executeUpdate(sql);
            
            if(x>0)
            {
            	sql = "INSERT into Employee_Salary values('" + eid + "' ,'" + role  + "','"  + salary + "' ,'" + bonus + "' )";
            	int y = stmt.executeUpdate(sql);
            	
            	if(y>0)
            		return true;
            	else
            		return false;
            }
            else
            {
            	return false;
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
