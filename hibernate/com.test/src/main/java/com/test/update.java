package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Employee e1=manager.find(Employee.class,1);
	e1.setName("rakesh");
	transaction.begin();
	manager.persist(e1);
	transaction.commit();
}
}
