package com.jpa.first;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Main {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("customerPU");
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("Just observe the table creation");
//		main.addNewDepartment();
//		main.addNewEmployee(1005);
//		main.searchByEmpId(1);
//		main.searchByDeptName("Development");
//		main.searchByDeptId(1004);
//		main.cartesianProductQuery();
		main.innerJoinQuery();
	}
	
//	void searchByDeptId(int deptId) {
//		EntityManager em = emf.createEntityManager();
//		Department d = em.find(Department.class, deptId);
//		if(d!=null) {
//			System.out.println(d.getDeptName());
//			String jpql = "select e from Employee e where e.department.deptId=:addr";
//			TypedQuery<Employee> q = em.createQuery(jpql, Employee.class);
//			q.setParameter("addr", deptId);
//			List<Employee> l = q.getResultList();
//			l.forEach(n->System.out.println(n.getEmpName()));
//		}else {
//			System.out.println("Department not found");
//		}
//	}
	
//	OR use birectional concept
	
	void searchByDeptId(int deptId) {
		EntityManager em = emf.createEntityManager();
		Department d = em.find(Department.class, deptId);
		if(d!=null) {
			System.out.println(d.getDeptName());
			List<Employee> emps = d.getEmployees();
			System.out.println("----Employee Name List----");
			emps.forEach(n->System.out.println(n.getEmpName()));
		}else {
			System.out.println("Department not found");
		}
	}
	
	void innerJoinQuery() {
		EntityManager em = emf.createEntityManager();
//		String jpql = "select e,d from Employee e join e.department d";
		Query q = em.createNamedQuery("empDeptJoin");
		List records = q.getResultList();
		for(Object row : records) {
			Object r[] = (Object[]) row;
			Employee e = (Employee) r[0];
			Department d = (Department) r[1];
			System.out.println(e.getEmpName()+" working in "+d.getDeptName()+" department");
		}
	}
	
	void cartesianProductQuery() {
		EntityManager em = emf.createEntityManager();
		String jpql = "select e,d from Employee e, Department d";
		Query q = em.createQuery(jpql);
		List records = q.getResultList();
		for(Object row : records) {
			Object r[] = (Object[]) row;
			Employee e = (Employee) r[0];
			Department d = (Department) r[1];
			System.out.println(e.getEmpName()+" working in "+d.getDeptName()+" department");
		}
	}
	
	void searchByDeptName(String dept) {
		EntityManager em = emf.createEntityManager();
		String jpql = "select e from Employee e where e.department.deptName = :p";
		TypedQuery<Employee> q = em.createQuery(jpql, Employee.class);
		q.setParameter("p", dept);
		System.out.println("----Employee are----");
		List<Employee> l = q.getResultList();
		l.forEach(n->System.out.println(n.getEmpName()));
	}
	
	void searchByEmpId(int id) {
		EntityManager em = emf.createEntityManager();
		Employee e = em.find(Employee.class	, id);
		if(e!=null) {
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getDepartment().getDeptId());
		}else {
			System.out.println("Employee not found");
		}
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
			e.setEmpName("Swathi");
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
