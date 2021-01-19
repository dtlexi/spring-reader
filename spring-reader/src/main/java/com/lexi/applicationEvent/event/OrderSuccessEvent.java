package com.lexi.applicationEvent.event;

import org.springframework.context.ApplicationEvent;

public class OrderSuccessEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7239057708183571937L;
	int orderId;

	public int getOrderId() {
		return orderId;
	}

	public OrderSuccessEvent(Object source,int orderId) {
		super(source);
		this.orderId=orderId;
	}
}
