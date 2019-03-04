package org.ffeng.demo.spring.handler;

public class CustomizedHandlerMapping extends org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping{
	public CustomizedHandlerMapping() {
		System.out.println("public class CustomizedHandlerMapping extends org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping{");
		throw new RuntimeException("CustomizedHandlerMapping");
	}
}
