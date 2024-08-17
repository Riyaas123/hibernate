package trryyy;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchall {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sri");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Query query=manager.createQuery("select a from mainclass a");
	List<mainclass>a=query.getResultList();
	for(mainclass mainclass:a ){
		System.out.println(a);
	}
}
}
