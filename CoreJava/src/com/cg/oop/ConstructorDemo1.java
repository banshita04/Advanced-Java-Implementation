package com.cg.oop;

public class ConstructorDemo1 {
public static void main(String[] args) {
	new Customer();
	//new Person(); Error
	new Person("Samiksha");
	new Employee();
	new Employee("Albin");
}
}
class Customer{
}
class Person{
	Person(String name){
		System.out.println("Person  "+name);
	}
}
class Employee{
	Employee(){
	System.out.println("Emp class default constructor");	
	}
	Employee(String name){
		System.out.println("Emp class parameterized constructor "+name);
	}
}
