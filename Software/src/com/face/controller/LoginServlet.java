package com.face.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String username= request.getParameter("username");
		String pswd = request.getParameter("pswd");
		
		LoginBO logbo = new LoginBO ();
		
		logbo.setUsename(username);
		logbo.setPswd(pswd);
		
		
ConnectionManager con= new ConnectionManager ();
		
		try {
			boolean status=LoginDAO.save (con.getConnection(),logbo);
			
			if (status==true) {
				
				
				String Name= logbo.getName();
				String Username=logbo.getUsername();
				String Email=logbo.getEmail();
				String Mobile=logbo.getMobile();
				String Password=logbo.getPswd();
				System.out.println (Name+" "+Username+" "+Email+" "+Mobile+" "+Password );

				request.setAttribute("Name",Name);
				request.setAttribute("Username",Username);
				request.setAttribute("Email",Email);
				request.setAttribute("Mobile",Mobile);
				request.setAttribute("Password",Password);
				request.getRequestDispatcher("welcome.jsp").forward(request, response);



				
				
				
			}
			
			else {
				response.sendRedirect("/Software/login.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
