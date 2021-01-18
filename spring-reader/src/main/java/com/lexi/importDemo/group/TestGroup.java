package com.lexi.importDemo.group;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class TestGroup implements DeferredImportSelector.Group {
	@Override
	public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {

	}

	@Override
	public Iterable<Entry> selectImports() {
		return null;
	}
}
