package com.jpa.first;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("customerPU");
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("Just observe the table creation");
		main.addNewDepartment();
//		main.addNewEmployee(1005);
	}

	void addNewDepartment() {
		Department d = new Department();
		d.setDeptId(1004);
		d.setDeptName("Business");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		System.out.println("New department added...");

	}

	void addNewEmployee(int deptId) {
		EntityManager em = emf.createEntityManager();
		Department d = em.find(Department.class, deptId);
		if(d!=null) {
			Employee e = new Employee();
//			e.setEmpId(101);
			e.setEmpName("Banshita");
			e.setDepartment(d);
			
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Added");
		}
		else {
			System.out.println("Dept not found");}
	}
}
