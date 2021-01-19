package com.lexi.applicationEvent.event;

import org.springframework.context.ApplicationEvent;

public class SmsSuccessEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7339057708183571937L;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public SmsSuccessEvent(Object source) {
		super(source);
	}
}
