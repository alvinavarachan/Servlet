package com.face.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;

public class LoginDAO {

	public static boolean save(Connection connection, LoginBO logbo) throws SQLException {
		// TODO Auto-generated method stub
		boolean status;
		Statement st= connection.createStatement();
		ResultSet rs= null;
		String Username= logbo.getUsername();
		String Pswd=logbo.getPswd();
		String sql="select * from reg where username= '"+Username+"' and pswd= '"+Pswd+"'";
		rs= st.executeQuery(sql);
		
		if (rs.next())
		{
			
		
			System.out.println ("Login Successfull");
			
			logbo.setName (rs.getString("name"));
			logbo.setEmail (rs.getString("email"));
			logbo.setMobile(rs.getString("mobile"));
			
			status= true;
			return status;
			
		}
		else
		{
			System.out.println ("Login Failed");
			status= false;
			return status;
		}
		
		
		
	}


}
