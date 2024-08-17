package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Employee;

public class Sample {
	public static void main(String[] args) {
		
EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("dash");
EntityManager eManager=eManagerFactory.createEntityManager();
EntityTransaction eTransaction=eManager.getTransaction();


Employee e1=new Employee();
//e1.setName("priya");
//e1.setPhno(47276328292l);

//eTransaction.begin();
//eManager.persist(e1);
//eTransaction.commit();

//Employee e=eManager.find(Employee.class, 1);
//System.out.println(e);

//Employee e=eManager.find(Employee.class, 1);
//e.setName("priiiii");
//
//eTransaction.begin();
//eManager.merge(e);
//eTransaction.commit();

Employee e=eManager.find(Employee.class,1);

eTransaction.begin();
eManager.remove(e);
eTransaction.commit();
}
}