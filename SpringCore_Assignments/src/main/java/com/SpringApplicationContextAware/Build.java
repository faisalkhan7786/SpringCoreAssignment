package com.SpringApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Build implements ApplicationContextAware {
private ApplicationContext context;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		context = applicationContext;
	}
	
	public void Slow()
	{
		Application a =  (Application) context.getBean("app");
		
		a.go();
}
}