package com.jpa.first;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class CustomerMain {
	
	EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("customerPU");//reads persistence.xml file
	public static void main(String[] args) {
		
		CustomerMain main=new CustomerMain();
		System.out.println("Hi , just observe the table creation");
//		main.addNewCustomer();
//		main.searchCustomerById(103);
		main.readAllCustomers();
//		main.searchCustomerByCity("Bangalore");
//		main.updateCustomerAddress(108, "Andhra");
//		main.removeCustomer(103);
		
	}
	
	void updateCustomerAddress(int id, String newAddress) {
		EntityManager em = emf.createEntityManager();
//		String jpql = "select c from Customer c where c.custId = :addr";
//		TypedQuery<Customer> q = em.createQuery(jpql, Customer.class);
//		q.setParameter("addr", id);
		Customer c = em.find(Customer.class, id);
		if(c!=null) {
			em.getTransaction().begin(); //starts the transaction
//			em.persist(c); //saves in the Database.....
			c.setAddress(newAddress);
			em.getTransaction().commit();
			System.out.println("Updated :)");
		}else {
			System.out.println("Customer not found");
		}
		em.close();
	}
	
	void removeCustomer(int id) {
		EntityManager em = emf.createEntityManager();
		Customer c = em.find(Customer.class, id);
		if(c!=null) {
			em.getTransaction().begin(); //starts the transaction
			em.persist(c); //saves in the Database.....
			em.remove(c);
			em.getTransaction().commit();
			System.out.println("Removed :)");
		}else {
			System.out.println("Customer not found");
		}
		
	}
	
	void searchCustomerById(int cid) {
		EntityManager em = emf.createEntityManager();
		//internally find() do select query
		Customer c = em.find(Customer.class, cid);
//		em.clear();//clears the cache memory
		
		//wont fire the select query this time, instead it get from cache memory
//		Customer c2 = em.find(Customer.class, cid);
		if(c!=null) {
			System.out.println(c.getCustId()+" "+c.getCustName()+" "+c.getAddress());
		}else {
			System.out.println("Customer not found");
		}
	}
	
	void searchCustomerByCity(String city) {
		EntityManager em = emf.createEntityManager();
		String jpql = "select c from Customer c where c.address = :addr";
		TypedQuery<Customer> q = em.createQuery(jpql, Customer.class);
		q.setParameter("addr", city);
		System.out.println("-----Customer from------ "+city);
		List<Customer> clist = q.getResultList();
		clist.forEach(c->System.out.println(c.getCustId()+" "+c.getCustName()+" "+c.getAddress()));
	}
	
	void readAllCustomers() {
		EntityManager em = emf.createEntityManager();
		String jpql = "select c from Customer c";
		TypedQuery<Customer> q = em.createQuery(jpql, Customer.class);
		List<Customer> clist = q.getResultList();
		clist.forEach(c->System.out.println(c.getCustId()+" "+c.getCustName()+" "+c.getAddress()));
	}
	
	void addNewCustomer() {
		Customer c=new Customer();
		c.setCustId(108);
		c.setCustName("Albin");
//		c.setAddress("Bangalore");
		
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin(); //starts the transaction
		em.persist(c); //saves in the Database.....
//		c.setAddress("Andhra Pradesh");
		em.getTransaction().commit(); //commit the transaction
		em.close();
		c.setAddress("Delhi");
		System.out.println("Added :) ");
		
	}

}

