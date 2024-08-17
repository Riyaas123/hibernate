package com.manytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindData {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("riyaas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Buyers Buyer=manager.find(Buyers.class,1);
	System.out.println(Buyer.getId());
	System.out.println(Buyer.getName());
	
	
}
}
