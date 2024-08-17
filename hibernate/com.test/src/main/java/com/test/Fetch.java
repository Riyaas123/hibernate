package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee e1=manager.find(Employee.class, 1);
		System.out.println(e1.getPhn());
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getPhn());
//		System.out.println(e1);
	}
}