package com.lexi.importDemo;

import com.lexi.importDemo.group.TestGroup;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportBeanSelectorDeferrd2 implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.lexi.importDemo.Test1"};
	}

	@Override
	public Class<? extends Group> getImportGroup() {
		return TestGroup.class;
	}
}
