package com.lexi.importDemo;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanSelectorDeferrd implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.lexi.importDemo.Test3","com.lexi.importDemo.Test1"};
	}
}
