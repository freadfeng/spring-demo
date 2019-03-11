package org.ffeng.demo.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SimpleUrlHandlerMappingTestContoller implements Controller{
	public SimpleUrlHandlerMappingTestContoller() {
		System.out.println("SimpleUrlHandlerMappingTestContoller");
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("==================================================");
		System.out.println("public class SimpleUrlHandlerMappingTestContoller implements Controller{");
		System.out.println("    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {");
		System.out.println("--------------------------------------------------");
		ModelAndView andView = new ModelAndView("index.html");
		return andView;
	}
}
