package org.ffeng.badminton.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println(this.getClass().getName());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			throw new Exception("Invalid username/password");
		}
		// query users
		
		//
		ModelAndView mv = new ModelAndView();
		mv.setViewName("badminton/index.jsp");
		return mv;
	}
}
