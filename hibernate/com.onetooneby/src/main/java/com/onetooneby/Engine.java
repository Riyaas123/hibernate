package com.onetooneby;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
@Id
private int car_id;
private String brand;
@OneToOne
private Car car;
public int getCar_id() {
	return car_id;
}
public void setCar_id(int car_id) {
	this.car_id = car_id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Car getCar() {
	return car;
}
public void setCar(Car car) {
	this.car = car;
}
public Engine() {
	super();
	// TODO Auto-generated constructor stub
}

}
