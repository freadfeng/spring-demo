package org.ffeng.demo.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	public DemoController() {
		System.out.println("=============== DemoController ===============");
	}
	
	@RequestMapping("/demoController/demoRequestMappingReturnMap")
	public Map<Object, Object> demoRequestMappingReturnMap(){
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("class", this.getClass().getName());
		map.put("method", "returnMap");
		return map;
	}
	
	@GetMapping(path = "/demoController/demoGetMappingContentTypeReturnString", consumes = "application/json")
	public String demoGetMappingContentTypeReturnString() {
		return "@PostMapping(path = \"/demoController/demoGetMappingContentTypeReturnString\", consumes = \"application/json\")";
	}
	
	@RequestMapping("/demoController/demoRequestPdf")
	public Map<Object, Object> demoRequestPdf(){
		return new HashMap<Object, Object>();
	}
	
	@RequestMapping("/demoController/demoRequestView")
	public ModelAndView demoRequestView(){
		ModelAndView andView = new ModelAndView("index.html");
		System.out.println("/demoController/demoRequestView");
		return andView;
	}
	
}
