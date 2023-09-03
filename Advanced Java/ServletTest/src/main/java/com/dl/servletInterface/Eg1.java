package com.dl.servletInterface;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Eg1 implements Servlet {

	private ServletConfig config;
	
	@Override
	public ServletConfig getServletConfig() {
         System.out.println("Get Servlet Config method");
		return config;
	}

	@Override
	public String getServletInfo() {
       System.out.println("Get servlet method invoked");
		return "getServletInfo";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method Invoked");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		StringBuffer sb = new StringBuffer("Hello Service");
		PrintWriter writer = response.getWriter();
		writer.print(sb);
	}
	public void destroy() {
	      System.out.println("Destroy method");		
		}


	

}
