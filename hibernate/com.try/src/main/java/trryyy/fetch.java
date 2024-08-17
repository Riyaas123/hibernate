package trryyy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sri");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	mainclass a=manager.find(mainclass.class, 1);
	System.out.println(a.getId());
	System.out.println(a.getName());
	System.out.println(a.getEmail());
	System.out.println(a.getPhn());
}
}
