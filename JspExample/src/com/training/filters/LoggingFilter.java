package com.training.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter(urlPatterns= {"/*"})
public class LoggingFilter implements Filter {

	
	Logger log = Logger.getLogger(this.getClass().getName());
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//  Code here will filtering request

		HttpServletRequest req = (HttpServletRequest)request;
		
		 String incomingRequest =req.getRequestURI() ;
		
		 log.info("request for:= "+ incomingRequest);
		 
		 log.info("request from"+ req.getLocalName());
		
		
//		 if(incomingRequest.contains("addBook")) {
//			 
//			 RequestDispatcher dispatcher = request.getRequestDispatcher("/contact.jsp");
//			 dispatcher.forward(request, response);
//		 }
		 
		   chain.doFilter(request, response);
		   
		   // code here will be filtering response
		   
		   log.info("Completed" + incomingRequest);
		   
//		   HttpServletResponse resp = (HttpServletResponse)response;
//		   
//		   resp.setStatus(201);
//		   
//		   PrintWriter out = response.getWriter();
//		   
//		    out.println("<h2>Managed by filters</h2>");
//		   
		   
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
