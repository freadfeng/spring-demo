package org.ffeng.badminton.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;

@SuppressWarnings("serial")
public class BadmintonDispatcherServlet extends DispatcherServlet {
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
	public BadmintonDispatcherServlet() {
		super();
		System.out.println("========== org.ffeng.demo.spring.servlet.BadmintonDispatcherServlet ==========");
	}
	
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("========== org.ffeng.demo.spring.servlet.BadmintonDispatcherServlet.doService() ========== ");
		System.out.println(getHandlerMappings());
		
		super.doService(request, response);
	}
	
}
