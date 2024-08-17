package com.ttr;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class laptop {
@Id
private int id;
private String Name;
private int Cost;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getCost() {
	return Cost;
}
public void setCost(int cost) {
	Cost = cost;
}
public laptop() {
	super();
	// TODO Auto-generated constructor stub
}

}
