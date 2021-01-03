package com.first.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstName = request.getParameter("firstName");
			if (firstName==null) {
				
				 firstName = "UnKnown";
			}
		String lastName = request.getParameter("lastName");
		if (lastName==null) {
			
			lastName = "UnKnown";
		}
		String favLang = request.getParameter("favLang");
		if (favLang==null) {
			
			favLang = "UnKnown";
		}
		String homeTown = request.getParameter("homeTown");
		if (homeTown==null) {
			
			homeTown = "UnKnown";
		}
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Hello World, from " + firstName+" " +lastName+ "</h1> <br>" + "<h2> Your favorite language is: " + favLang+"</h2><br>"+"<h3>Your home town is : "+homeTown+"</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
