package practice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import practice.dto.Practice;

public class remove {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("riya");
	EntityManager em=emf.createEntityManager();
	EntityTransaction eT=em.getTransaction();
	
	Practice p=em.find(Practice.class,1);
	eT.begin();
	em.remove(p);
	eT.commit();
	
}
}
