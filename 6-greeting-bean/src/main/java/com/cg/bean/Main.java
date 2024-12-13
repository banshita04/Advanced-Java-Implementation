package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//initializing spring container
		//in default all the beans are singleton
		//even if u call 100 times, it will refer to only 1 created obj
		//singleton class -> class in which we create one obj
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Spring container initialized...");
		GreetingBean bean = (GreetingBean) ctx.getBean("greet");
		System.out.println(bean.sayHello("banshita"));
		GreetingBean bean2 = (GreetingBean) ctx.getBean("greet");
		GreetingBean bean3 = (GreetingBean) ctx.getBean("greet");

	}
}
