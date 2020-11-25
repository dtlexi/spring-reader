package com.lexi.controller;

import com.lexi.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestMethodHandlerController {

	@RequestMapping(value = "/method.do",method = RequestMethod.GET)
	@ResponseBody
	public String testWithGet()
	{
		System.out.println("get");
		return "get";
	}

	@RequestMapping(value = "/method.do",method = RequestMethod.POST)
	@ResponseBody
	public String testWithPost()
	{
		System.out.println("post");
		return "post";
	}

	@ResponseBody
	@RequestMapping("/pattern/{index}.do")
	public String testWithPatterns(@PathVariable("index") Integer index)
	{
		System.out.println(index);
		return  index.toString();
	}

	@ResponseBody
	@RequestMapping(value = "/header.do",headers = {"content-type"})
	public String testWithHeader()
	{
		System.out.println("header");
		return "header";
	}

	@ResponseBody
	@RequestMapping(value = "/header.do",headers = {"content-type","content-length"})
	public String testWithHeader1()
	{
		System.out.println("header");
		return "header1";
	}

	@ResponseBody
	@RequestMapping(value = "/params.do")
	public String testWithParams(String name,int age)
	{
		return "params";
	}

	@ResponseBody
	@RequestMapping(value = "/params1.do")
	public String testWithObjectParams(Person person)
	{
		return "testWithObjectParams";
	}

	@ResponseBody
	@RequestMapping(value = "/params4.do")
	public String testWithObjectParams4(@RequestParam(required = false) Person person)
	{
		return "testWithObjectParams";
	}

	@ResponseBody
	@RequestMapping(value = "/params2.do")
	public String testWithMapParams(@RequestParam(required = false) Map<String,String> map)
	{
		return "testWithMapParams";
	}

	@ResponseBody
	@RequestMapping(value = "/params3.do")
	public String testWithMapParams3(Map<String,String> map)
	{
		return "testWithMapParams";
	}

	@ResponseBody
	@RequestMapping(value = "/params5/{name}/{age}.do")
	public String testWithParams5(@PathVariable String name,@PathVariable int age)
	{
		return "params";
	}
}
