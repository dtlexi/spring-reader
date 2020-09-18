package com.lexi.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.HashMap;

public class BeanFactory {
	public HashMap<String,Object> singletonObjects;

	public BeanFactory()
	{
		this.singletonObjects=new HashMap<>();
	}

	/**
	 * 创建对象
	 * @param c
	 * @param <T>
	 * @return
	 * @throws Exception
	 */
	private  <T> T createBean(Class<T> c) throws Exception {
		Constructor constructor=c.getDeclaredConstructor();
		T obj= (T)constructor.newInstance();
		this.populateBean(obj);
		return  obj;
	}

	/**
	 * 属性赋值
	 * @param obj
	 * @throws Exception
	 */
	private void populateBean(Object obj) throws Exception {
		Class cls=obj.getClass();
		Field[] fields=cls.getDeclaredFields();
		for (Field field:
			 fields) {
			Class typeField=field.getType();
			String key=
		}
	}

	public Object getSingleton(String beanName)
	{
		return this.singletonObjects.get(beanName);
	}

	/**
	 * 获取对象
	 * @param c
	 * @param <T>
	 * @return
	 * @throws Exception
	 */
	public  <T> T getBean(Class<T> c) throws Exception {
		String beanName=c.toString();
		Object obj=getSingleton(beanName);
		if(obj!=null)
		{
			return (T)obj;
		}
		T ojb= createBean(c);
		singletonObjects.put(key,ojb);
		return ojb;
	}
}
