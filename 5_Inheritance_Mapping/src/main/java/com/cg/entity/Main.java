package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	EntityManagerFactory emf=
			Persistence.createEntityManagerFactory("customerPU");
	public static void main(String[] args) {
		Main m=new Main();
		m.add();
	}
	void add() {
		HomeLoan h=new HomeLoan();
		h.setAccNo(100001);
		h.setAccName("CM");
		h.setInterestRate(9.5f);
		h.setLoanAmt(5000000);
		h.setAddress("BTM,Bangalore");

		GoldLoan g=new GoldLoan();
		g.setAccNo(100002);
		g.setAccName("Khushi");
		g.setGoldWeightInGrams(100);
		g.setInterestRate(9.9f);
		g.setLoanAmt(100000);

		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(h);
		em.persist(g);
		em.getTransaction().commit();
		System.out.println("Added ....");
	}

}





