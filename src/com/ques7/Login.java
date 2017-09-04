package com.ques7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		if((request.getParameter("name")).equals("shubham")&&(request.getParameter("password")).equals("verma"))
		{
			request.getRequestDispatcher("link.html").include(request, response);  
			  pw.print("You are successfully logged in!");  
	            pw.print("<br>Welcome, "+request.getParameter("name"));  
	              
	            Cookie ck=new Cookie("name",request.getParameter("name"));  
	            response.addCookie(ck);  
		}
		else
		{
			pw.println("incorrect credentials");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

}
