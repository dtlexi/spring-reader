package com.lexi.applicationEvent.service;

import com.lexi.applicationEvent.event.SmsSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SmsService {
	@Autowired
	ApplicationContext applicationContext;

	public void sendSms()
	{
		System.out.println("发送短信。");

		this.applicationContext.publishEvent(new SmsSuccessEvent(this));
	}
}
