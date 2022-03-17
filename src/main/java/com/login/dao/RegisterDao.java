package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterDao {
	String username = "postgres";
	String password = "password";
	String url = "jdbc:postgresql://localhost:5432/Flight-Booking-System";
	
	public boolean register(String uname, String pass, String fname, String lname, String email)
	{
		return true;
//		try {
//			Class.forName("org.postgresql.Driver");
//            Connection con = DriverManager.getConnection(url, username, password);
//            
//            String sql = "INSERT into Customer values('" + uname + "' ,'" + pass  + "','"  + fname + "' ,'" + lname + "','" + email + "' )";
//            
//            Statement stmt = con.createStatement();
//            int x = stmt.executeUpdate(sql);
//            
//            if(x>0)
//            {
//            	return true;
//            }
//            else
//            {
//            	return false;
//            }
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		return false;
	}
	
}
