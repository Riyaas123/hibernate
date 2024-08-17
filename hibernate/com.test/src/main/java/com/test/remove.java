package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class remove {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Employee e1=manager.find(Employee.class,2);
	transaction.begin();
	manager.remove(e1);
	transaction.commit();
}
}
