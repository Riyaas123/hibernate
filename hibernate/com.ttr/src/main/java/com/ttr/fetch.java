package com.ttr;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Student std=manager.find(Student.class, 1);
	System.out.println(std.getId());
	System.out.println(std.getName());
	List<laptop>laptop1=std.getLaptop();
	for(laptop l:laptop1)
	{
		System.out.println(l.getId());
		System.out.println(l.getName());
		System.out.println(l.getCost());
	}
}
}