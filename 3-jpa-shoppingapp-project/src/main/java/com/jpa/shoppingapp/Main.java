package com.jpa.shoppingapp;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("customerPU");
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("Just observe the table creation");
//		main.addCustomer();
//		main.addProduct();
//		main.updatePrice(11, 75000f);
		main.orderProduct(2, 4, 1);
	}

	void addCustomer() {
		EntityManager em = emf.createEntityManager();
		Customer c = new Customer();
		c.setCname("Mansi");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		System.out.println("Customer Added :)");
	}
	
	void addProduct() {
		EntityManager em = emf.createEntityManager();
		Product p = new Product();
		p.setProdName("IPhone");
		p.setPrice(1);
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		System.out.println("Product Added :)");
		
	}
	
	void updatePrice(int prodId, Float newPrice) {
		EntityManager em = emf.createEntityManager();
		Product p = em.find(Product.class, prodId);
		if(p!=null) {
			em.getTransaction().begin();
			p.setPrice(newPrice);
			em.getTransaction().commit();
			System.out.println("Price updated");
			
		}else {
			System.out.println("Customer not found");
		}
		em.close();
	}
	
	void deleteProduct(int pid) {
		EntityManager em = emf.createEntityManager();
		Product p = em.find(Product.class, pid);
		if(p!=null) {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			System.out.println("Product removed");
		}else {
			System.out.println("Product not found");
		}
		em.close();
	}
	
	void orderProduct(int pid, int cid, int q) {
		EntityManager em = emf.createEntityManager();
		Order o = new Order();
		o.setOrderDate(LocalDate.now());
		Customer c = em.find(Customer.class, cid);
		o.setC(c);
		Product p = em.find(Product.class, pid);
		o.setP(p);
		o.setQuantity(q);
		em.getTransaction().begin();
		em.persist(o);
		em.getTransaction().commit();
		em.close();
		System.out.println("Ordered successfully");
	}
	
	void searchOrderByOrderIdOrderDate(int oid, String date) {
		
		
	}
}

