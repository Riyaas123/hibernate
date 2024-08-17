package trryyy;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class sample {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sri");
	System.out.println(factory);
			}
}
