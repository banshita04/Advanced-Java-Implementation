package com.jpa.first;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class EmployeeMain {
	
	EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("customerPU");//reads persistence.xml file
	public static void main(String[] args) {
		
		EmployeeMain main=new EmployeeMain();
		System.out.println("Hi , just observe the table creation");
//		main.addNewCustomer();
//		main.searchEmployeeById(2);
//		main.readAllEmployees();
		main.searchEmployeeByPlaceName("EPIP");
	}
	
	void searchEmployeeById(int cid) {
		EntityManager em = emf.createEntityManager();
		
		//internally find() do select query
		Employee c = em.find(Employee.class, cid);
		if(c!=null) {
			System.out.println(c.getEmpId()+" "+c.getEmpName()+" "
					+c.getAddress().getDoorNo()+" "+c.getAddress().getStreetName()+" "
							+c.getAddress().getLandmark()+" "+c.getAddress().getPinCode());
		}else {
			System.out.println("Employee not found");
		}
	}
	
	void searchEmployeeByPlaceName(String place) {
		EntityManager em = emf.createEntityManager();
		String jpql = "select c from Employee c where c.address.landmark = :addr";
		TypedQuery<Employee> q = em.createQuery(jpql, Employee.class);
		q.setParameter("addr", place);
		System.out.println("-----Customer from------ "+place);
		List<Employee> clist = q.getResultList();
		clist.forEach(c->System.out.println(c.getEmpId()+" "+c.getEmpName()+" "
		+c.getAddress().getDoorNo()+" "+c.getAddress().getStreetName()+" "
				+c.getAddress().getLandmark()+" "+c.getAddress().getPinCode()));
	}
	
	void readAllEmployees() {
		EntityManager em = emf.createEntityManager();
		String jpql = "select c from Employee c";
		TypedQuery<Employee> q = em.createQuery(jpql, Employee.class);
		List<Employee> clist = q.getResultList();
		clist.forEach(c->System.out.println(c.getEmpId()+" "+c.getEmpName()+" "
		+c.getAddress().getDoorNo()+" "+c.getAddress().getStreetName()+" "
				+c.getAddress().getLandmark()+" "+c.getAddress().getPinCode()));
	}
	
	void addNewCustomer() {
		Employee c=new Employee();
//		c.setEmpId(103);
		c.setEmpName("Mansi");
		c.setSalary(90000.0f);
		Address a = new Address();
		a.setDoorNo("302");
		a.setStreetName("2nd Main");
		a.setLandmark("Living Stone Homes");
		a.setPinCode(560066);
		c.setAddress(a);
		
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin(); //starts the transaction
		em.persist(c); //saves in the Database.....
		em.getTransaction().commit(); //commit the transaction
		
		System.out.println("Added :) ");
		
	}

}

