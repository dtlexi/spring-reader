package com.lexi.controller;


import com.lexi.model.Person;
import com.lexi.service.HelloService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HelloController implements InitializingBean,BaseController {
	@Autowired
	HelloService helloService;

	@ResponseBody
	@RequestMapping("/hello.do")
	public String sayHello(String name,int age)
	{
		System.out.println(name);
		System.out.println(age);
		return "list";
	}

	@RequestMapping("/hello1.do")
	public String sayHello1()
	{
		System.out.println(helloService);
		return "index";

	}

	@ResponseBody
	@RequestMapping("/hello2.do")
	public Person sayHello2()
	{
		Person person=new Person();
		person.setAge(12);
		person.setName("张是哪");
		return person;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("12");
	}

	@Override
	public String test() {
		return  "test";
	}
}
