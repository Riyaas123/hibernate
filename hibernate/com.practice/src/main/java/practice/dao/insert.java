package practice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import practice.dto.Practice;

public class insert {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("riya");
	EntityManager em=emf.createEntityManager();
	EntityTransaction eT=em.getTransaction();
	
	Practice p=new Practice();
//	p.setId(1);
	p.setName("piya");
	p.setEmail("piyaasmohamedn@gmail.com");
	
	eT.begin();
	em.persist(p);
	eT.commit();
	
	em.close();
}
}
