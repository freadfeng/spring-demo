package org.ffeng.demo.spring.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

@SuppressWarnings("serial")
public class CustomizedDispatcherServlet extends DispatcherServlet {
	/**
	 * DispatcherServlet
	 * HandlerMapping
	 * Handler
	 * Intercepter
	 * HandlerExecution
	 * HandlerAdapter
	 * ModelAndView
	 * ViewResolver
	 * View
	 * render
	 */
	public CustomizedDispatcherServlet() {
		super();
		System.out.println("========== org.ffeng.demo.spring.servlet.CustomizedDispatcherServlet ==========");
	}
	
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("========== org.ffeng.demo.spring.servlet.CustomizedDispatcherServlet.doService() ========== ");
		System.out.println(getHandlerMappings());
		super.doService(request, response);
		System.out.println(); 
	}
	public static void main(String[] args) {
		System.out.println(CustomizedDispatcherServlet.class.getName());
	}
	@Override
	protected void initStrategies(ApplicationContext context) {
		// TODO Auto-generated method stub
		super.initStrategies(context);
	}

}
