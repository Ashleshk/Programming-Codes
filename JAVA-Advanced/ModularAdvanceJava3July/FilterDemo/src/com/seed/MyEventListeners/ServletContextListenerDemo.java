package com.seed.MyEventListeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerDemo implements ServletContextListener {

	public ServletContextListenerDemo() {

	}

	public void contextDestroyed(ServletContextEvent arg0) {

	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("servlet context initialzed");
		ServletContext context = sce.getServletContext();
		String username = context.getInitParameter("Username");
		String password = context.getInitParameter("Password");
		String url = context.getInitParameter("URL");
		String driverName = context.getInitParameter("Driver");
		System.out.println("User name "+username);
		System.out.println("password "+password);
		System.out.println("URL  "+url);
		System.out.println("driver name "+driverName);
	}

}
