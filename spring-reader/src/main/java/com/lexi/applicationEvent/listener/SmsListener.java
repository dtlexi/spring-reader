package com.lexi.applicationEvent.listener;

import com.lexi.applicationEvent.event.OrderSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SmsListener implements ApplicationListener<OrderSuccessEvent> {
	@Override
	public void onApplicationEvent(OrderSuccessEvent event) {
		System.out.println("发送短信给订单"+event.getOrderId()+"的用户");
	}
}
