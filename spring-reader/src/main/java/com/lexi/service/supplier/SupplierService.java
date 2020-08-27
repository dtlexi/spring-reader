package com.lexi.service.supplier;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class SupplierService implements Supplier<HelloServiceBySupplier> {
	@Override
	public HelloServiceBySupplier get() {
		return new HelloServiceBySupplier();
	}
}
