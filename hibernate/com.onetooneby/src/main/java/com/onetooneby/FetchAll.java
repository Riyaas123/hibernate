package com.onetooneby;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAll {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("riyaas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Car car=manager.find(Car.class,1);
	System.out.println(car.getNo());
	System.out.println(car.getBrand());
	
	Engine e=car.getEngine();
	System.out.println(e.getCar_id());
	System.out.println(e.getCar_id());
	System.out.println("******");
	
	Engine engine=manager.find(Engine.class,001);
	System.out.println(engine.getCar_id());
	System.out.println(engine.getBrand());
	System.out.println(engine.getCar());
	
	
	 Car c=engine.getCar();
	 System.out.println(c.getNo());
	 System.out.println(c.getBrand());
	 
}
}
