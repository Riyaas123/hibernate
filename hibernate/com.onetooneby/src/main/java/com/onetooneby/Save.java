package com.onetooneby;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("riyaas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Car car=new Car();
	car.setNo(1);
	car.setBrand("honda");
	
	Engine engine=new Engine();
	engine.setCar_id(001);
	engine.setBrand("bmw");
	
	car.setEngine(engine);
    engine.setCar(car);
    
    transaction.begin();
    manager.persist(engine);
    manager.persist(car);
    transaction.commit();
	
}
}
