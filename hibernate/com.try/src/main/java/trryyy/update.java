package trryyy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sri");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	mainclass a=manager.find(mainclass.class,1);
	a.setName("riyaasmohamed");
	transaction.begin();
	manager.persist(a);
	transaction.commit();
}
}
