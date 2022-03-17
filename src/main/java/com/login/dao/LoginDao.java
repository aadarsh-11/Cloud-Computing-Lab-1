package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String username = "postgres";
	String password = "password";
	String url = "jdbc:postgresql://localhost:5432/Flight-Booking-System";
	String sql = "SELECT * FROM customer where fname=? and password=?";
	
	public boolean check(String uname, String pass)
	{
		try {
			Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, uname);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            {
            	return true;
            }
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
