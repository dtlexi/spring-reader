package com.lexi.controller;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Component("/test1/{index}.do")
public class TestController implements Controller {
	@Override
	public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println("test1");
		return null;
	}
}
