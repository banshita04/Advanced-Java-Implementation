package com.cg.bean;

import java.util.List;

public class GreetingBean {
	private String msg;
	private List<String> messages;
	
	public GreetingBean() {
		System.out.println("Greeting Bean initialized...");
	}
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Setter method called");
	}
	public void setMessage(List<String> messages) {
		this.messages = messages;
		System.out.println(messages);
	}
	public String sayHello(String name) {
		return "hi "+name+" "+msg;
	}
}
