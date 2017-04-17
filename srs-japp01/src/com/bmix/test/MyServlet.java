package com.bmix.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String name=fname+" "+lname;
		
		String imgSrc="user.png";
		
		if(fname.equalsIgnoreCase("Sunit"))
			imgSrc="sunit.jpg";
		
		response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Welcome "+name;	      
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
	         "transitional//en\">\n";
				
	      out.println(docType + "<html>\n" +
	         "<head><title> Welcome " + fname + "</title></head>\n" +
	         "<body>\n" +
	         "<h1 align=\"center\">" + title+"</h1><br>");
	         		
	      out.println("<ul align=\"center\"><img src='" + request.getContextPath() + "/images/"+imgSrc+"' alt='image' height=\"60\" width=\"60\" /></ul>");
	
	      out.println("<h2 align=\"center\"> to Sunit's First Cloud App</h2>\n" +
	         "<ul align=\"center\">\n" +
	         "Request Time = "+new Timestamp(System.currentTimeMillis())+
	         
	         "</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
