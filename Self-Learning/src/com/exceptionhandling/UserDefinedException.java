package com.exceptionhandling;

public class UserDefinedException {
 public static void main(String[] args) {
	UserDefinedException ude = new UserDefinedException();
	try {
		ude.doSomething();
	} catch (ZeroException e) {
		e.printStackTrace();
	}
}
 
 public class ZeroException extends Exception{
	 
 }
 
 public void doSomething() throws ZeroException {
	 String str = "Zero";
	 if(str.equals("Zero")) {
		 throw new ZeroException();
	 }
	 System.out.println("Do something");
 }
}


