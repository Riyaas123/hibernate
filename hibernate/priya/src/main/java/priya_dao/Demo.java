package priya_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import priya_dto.Test;

public class Demo {
	EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("vicky");
	EntityManager eManager=emFactory.createEntityManager();
	EntityTransaction eTransaction=eManager.getTransaction();
	
	public void insert(Test t)
	{
		eTransaction.begin();
		eManager.persist(t);
		eTransaction.commit();
	}
}
