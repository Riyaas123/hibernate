package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Employee e1=new Employee();
	e1.setId(3);
	e1.setName("siva");
	e1.setEmail("siva43@gmail.com");
	e1.setPhn(962714625L);
	
	transaction.begin();
	manager.persist(e1);
	transaction.commit();
}
}
