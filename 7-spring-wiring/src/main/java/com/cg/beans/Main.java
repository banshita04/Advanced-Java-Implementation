package com.cg.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Spring container initialized");
		AccountService service = (AccountService) ctx.getBean("service");
		System.out.println(service.creditService(100000));
	}

}
