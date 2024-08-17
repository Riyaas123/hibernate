package com.project;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CarController {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void saveCar(Car car) {
		transaction.begin();
		manager.persist(car);
		transaction.commit();
	}
	public void update(double cost,int id){
		Car car=manager.find(Car.class, id);
		car.setCost(cost);
		transaction.begin();
		manager.merge(car);
		transaction.commit();
	}
	public Car findById(int id) {
		Car car=manager.find(Car.class,id);
		return car;
	}
	public void delete(int id) {
		Car car=manager.find(Car.class, id);
		transaction.begin();
		manager.remove(car);
		transaction.commit();

	}
	public List<Car> fetchall() {
		Query query = manager.createQuery("select c from Car c");
		List<Car> cars=query.getResultList();
		return cars;
	}
}
