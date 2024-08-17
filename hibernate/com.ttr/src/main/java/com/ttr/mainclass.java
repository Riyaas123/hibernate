package com.ttr;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainclass {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("akshay");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Student std = new Student();
		std.setId(100);
		std.setName("riya");
		laptop lap = new laptop();
		lap.setId(101);
		lap.setName("hp");
		lap.setCost(70000);
		laptop lap1 = new laptop();
		lap1.setId(201);
		lap1.setName("dell");
		lap1.setCost(85000);
		ArrayList<laptop> l = new ArrayList();
		l.add(lap);
		l.add(lap1);
		std.setLaptop(Arrays.asList(lap,lap1));
		//std.setLaptop(l);
		transaction.begin();
		manager.persist(std);
		manager.persist(lap);
		manager.persist(lap1);
		transaction.commit();
	}
}