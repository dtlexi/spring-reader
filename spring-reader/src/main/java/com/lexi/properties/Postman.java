package com.lexi.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:db.properties")
public class Postman {
	@Value("${name}")
	String name;

	@Value("${age}")
	Integer age;

	@Override
	public String toString() {
		return "Postman{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
