/**
 * 
 */
package com.onebill.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rathesh Prabakar
 *
 */
public class HelloWorld extends HttpServlet {

	/**
	 * @param args
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		p.println("Welcome to Servlets");
		
	}
}
