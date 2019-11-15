package com.face.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class ConnectionManager { 
	static Connection conn= null;
	public static Properties loadPropertiesFile() throws Exception {
		
		Properties prop = new Properties();
		InputStream in= new FileInputStream ("C:\\Users\\User\\eclipse-workspace\\Software\\src\\resources\\jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
		
	}
	
	
	public Connection getConnection() throws Exception {
		Properties prop = loadPropertiesFile();
		final String driver = prop.getProperty("driver");
		final String url = prop.getProperty("url");
		final String username = prop.getProperty("username");
		final String password = prop.getProperty("password");
		
		
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,username,password);
		System.out.println ("Connection Failed!  Check output console");
		
		
		return conn;
	
	}

}
