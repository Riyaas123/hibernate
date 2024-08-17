package Randomnumber.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Randomnumber.Dto.User;

public class UserDao {
EntityManagerFactory eManagerFactory=Persistence.createEntityManagerFactory("Dhas");
EntityManager eManager=eManagerFactory.createEntityManager();
EntityTransaction eTransaction=eManager.getTransaction();

public void addObjects(User u){
	eTransaction.begin();
	eManager.persist(u);
	eTransaction.commit();
	
}
}
