package com.lexi.edit;

import java.beans.PropertyEditorSupport;

public class TestPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		int a = Integer.parseInt(text);
		super.setValue(a);
	}

	@Override
	public void setValue(Object value) {
		if(value instanceof Number)
		{
			int intValue = (int) value;
			super.setValue(intValue);
		}
		super.setValue(value);
	}
}
