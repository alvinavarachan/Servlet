package com.face.dao;

import java.sql.*;

import com.face.bo.RegisterBO;

public class RegisterDAO {

	public static void save(Connection connection, RegisterBO regbo) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement st= connection.createStatement();
		String query = "insert into reg values ('"+regbo.getName()+"', '"+regbo.getUsername()+"', '"+regbo.getEmail()+"', '"+regbo.getMobile()+"', '"+regbo.getPswd()+"')";
		
		
		int resultset = st.executeUpdate(query);
		
		if (resultset ==1) {
			System.out.println ("Data Added Successfully");
			
		}
		else {
			System.out.println ("Some Errors happen");
		}
		
		
	
		
		
	}

}
