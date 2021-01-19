package com.lexi.applicationEvent.service;

import com.lexi.applicationEvent.event.OrderSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CarService {
	@EventListener
	@Async
	public void notifyCar(OrderSuccessEvent orderSuccessEvent)
	{
		System.out.println("订单"+orderSuccessEvent.getOrderId()+"发货了！！！");
	}

	@EventListener
	public void ListenerAllEvent(Object obj)
	{
		System.out.println(obj);
		System.out.println("监听到所有事件");
	}
}
