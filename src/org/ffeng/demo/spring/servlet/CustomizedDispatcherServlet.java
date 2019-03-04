package org.ffeng.demo.spring.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

@SuppressWarnings("serial")
public class CustomizedDispatcherServlet extends DispatcherServlet {
	public CustomizedDispatcherServlet() {
		super();
		System.out.println("========== org.ffeng.demo.spring.servlet.CustomizedDispatcherServlet ==========");
	}
	
	@Override
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("========== org.ffeng.demo.spring.servlet.CustomizedDispatcherServlet.doService() ========== ");
//		super.doService(request, response);
		doTrace(request, response);
		System.out.println(this.getHandlerMappings());
	}
}
