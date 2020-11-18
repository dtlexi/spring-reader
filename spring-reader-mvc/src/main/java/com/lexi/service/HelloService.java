package com.lexi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Service
@EnableWebMvc
public class HelloService {
	@Override
	public String toString() {
		return "hello service";
	}
}
