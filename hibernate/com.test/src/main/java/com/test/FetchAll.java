package com.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
//	List<Employee> a=manager.createQuery("select e from employee e").getResultList();
    Query query=manager.createQuery("select e from Employee e");
    List<Employee> a=query.getResultList();
    for(Employee Employee :a){
    	System.out.println(Employee);
    }
}
}
