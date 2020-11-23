package com.lexi.controller;


import com.lexi.model.Person;
import com.lexi.service.HelloService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class HelloController implements InitializingBean,BaseController {
	@Autowired
	HelloService helloService;

	@ResponseBody
	@RequestMapping(value = "/hello.do",method = {RequestMethod.GET})
	public String sayHello()
	{
		return "list";
	}

	@ResponseBody
	@RequestMapping(value = "/hello.do")
	public String sayHello1()
	{
		return "list1";
	}

	@RequestMapping(value = "/hello/{id}.do",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.HEAD})
	public String sayHello1(@PathVariable("id") int id)
	{
		System.out.println(helloService);
		System.out.println(id);
		return "index";

	}

	@ResponseBody
	@RequestMapping(value = "/hello/{name}.do",method = {RequestMethod.GET,RequestMethod.HEAD})
	public Person sayHello2(@PathVariable("name") String name)
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
