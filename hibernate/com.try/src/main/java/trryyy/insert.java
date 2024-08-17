package trryyy;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sri");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	mainclass a=new mainclass();
	a.setId(1);
	a.setName("riyaass");
	a.setEmail("riyaasmohamedn@gmail.com");
    a.setPhn(63235225L);
    a.setId(2);
    a.setName("mohamed");
    a.setEmail("mohamed@gmail.com");
    a.setPhn(1234567878L);
    transaction.begin();
    manager.persist(a);
    transaction.commit();
}
}
