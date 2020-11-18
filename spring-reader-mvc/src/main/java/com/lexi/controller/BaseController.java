package com.lexi.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface BaseController {
	@RequestMapping("test")
	public String test();
}
