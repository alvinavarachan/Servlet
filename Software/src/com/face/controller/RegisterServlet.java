package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Alvin Avarachan
 * @implnte Servlet implementation class to perform user registration
 * Date-14/11/19
 * 
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @implspec Action Metod to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name= request.getParameter("name");
		String username= request.getParameter("username");
		String email= request.getParameter("email");
		String mobile= request.getParameter("mobile");
		String pswd= request.getParameter("pswd");
		
		RegisterBO regbo= new RegisterBO();
		regbo.setName(name);
		regbo.setUsername(username);
		regbo.setEmail(email);
		regbo.setMobile(mobile);
		regbo.setPswd(pswd);
		
		
		ConnectionManager con= new ConnectionManager ();
		
		try {
			RegisterDAO.save (con.getConnection(),regbo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/Software/login.jsp");
		
	}

}
