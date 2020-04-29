package com.seed.MyFilters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {

  
  	public void destroy() {
	System.out.println("filter destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		

		String s = request.getParameter("username");
		System.out.println(" ****             "+s);
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		System.out.println(" ####             "+s);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init");
	}

}
