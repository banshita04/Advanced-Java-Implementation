package com.cg.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx1=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println("Spring container initialized ");
		AccountService service= (AccountService) ctx1.getBean("service");
		System.out.println(service.creditService(10000));
	}
}
