package com.App;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
   		String uname = request.getParameter("username");
   		String password = request.getParameter("pass");
   		
   		if(uname.equals("Bharath") && password.equals("1234")) {
   			
   			HttpSession session = request.getSession();
   			session.setAttribute("username",uname);
   			response.sendRedirect("welcome.jsp");
   		}else {
   			
   			response.sendRedirect("login.jsp");
   		}
   		
   		
	}

}