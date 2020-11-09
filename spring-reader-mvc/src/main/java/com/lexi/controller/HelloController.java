package com.lexi.controller;


import com.lexi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HelloController {
	@Autowired
	HelloService helloService;

	@ResponseBody
	@RequestMapping("/hello.do")
	public String sayHello()
	{
		System.out.println(helloService);
		return "list";
	}

	@ResponseBody
	@RequestMapping("/hello1.do")
	public String sayHello1()
	{
		System.out.println(helloService);
		return "list";
	}

	@ResponseBody
	@RequestMapping("/hello2.do")
	public String sayHello2()
	{
		System.out.println(helloService);
		return "list";
	}
}
