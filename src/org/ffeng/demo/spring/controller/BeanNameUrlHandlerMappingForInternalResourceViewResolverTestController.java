package org.ffeng.demo.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class BeanNameUrlHandlerMappingForInternalResourceViewResolverTestController implements Controller{
	
@Override
public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	Map<String, Object> model = new HashMap<String, Object>();
	model.put("name", "fread");
	model.put("age", 29);
	String viewName = "showModels.jsp";
	ModelAndView modelAndView = new ModelAndView(viewName, model);
	return modelAndView;
}
}
