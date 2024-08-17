package com.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("riyaas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Buyers buyer=new Buyers(1,"vijay");
	Buyers buyer1=new Buyers(2,"raju");
	Buyers buyer2=new Buyers(3,"nithish");
	
	
	List<Buyers>buyers=Arrays.asList(buyer,buyer1,buyer2);
		Brand brand=new Brand(27,"OMR",650,buyers);
		Brand brand1=new Brand(28,"Redlabel",2400,buyers);
		Brand brand2=new Brand(29,"olaMonk",1660,buyers);
		
		
		transaction.begin();
		manager.persist(buyer);
	    manager.persist(buyer1);
	    manager.persist(buyer2);
	    manager.persist(brand);
	    manager.persist(brand1);
	    manager.persist(brand2);
	    transaction.commit();
}
}
