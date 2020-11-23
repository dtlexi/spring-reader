package com.lexi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
