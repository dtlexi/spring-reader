package com.lexi.applicationEvent.service;

import com.lexi.applicationEvent.event.OrderSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
	ApplicationContext applicationContext;

	public void order(int orderId)
	{
		System.out.println("订单"+orderId+"下单成功！");
		// 发布时间
		//this.applicationContext.publishEvent(new OrderSuccessEvent(this,orderId));

		this.applicationContext.publishEvent(1);
	}
}
