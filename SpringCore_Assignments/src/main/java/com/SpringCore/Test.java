package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
	  
	  @SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("com/SpringCore/spring.xml");
      Customer customer = (Customer) context.getBean("customer1");
      System.out.println(customer);
  }
}
