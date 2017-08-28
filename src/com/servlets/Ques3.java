package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ques3
 */
@WebServlet("/Ques3")
public class Ques3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ques3() {
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
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		response.setContentType("text/html");
		if(fname.equals("shubham")&&lname.equals("verma"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("CorrectPassword");
			request.setAttribute("firstName", fname);
			rd.forward(request, response);
		}
		else{
			PrintWriter pw=response.getWriter();
			pw.println("<html>");
			pw.println("<title>first page</title>");
			pw.println("<body>");
			pw.println("<h3>incorrect password</h3>");
			pw.println("</body>");
			pw.println("</html>");
		}
		
	}

}
