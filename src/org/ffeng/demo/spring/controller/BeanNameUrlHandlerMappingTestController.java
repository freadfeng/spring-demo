package org.ffeng.demo.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BeanNameUrlHandlerMappingTestController implements Controller{
	public BeanNameUrlHandlerMappingTestController() {
		System.out.println("BeanNameUrlHandlerMappingTestController()");
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("==================================================");
		System.out.println("public class BeanNameUrlHandlerMappingControllerTest implements Controller{");
		System.out.println("    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {");
		System.out.println("--------------------------------------------------");
		ModelAndView andView = new ModelAndView("index.html");
		return andView;
	}
}
