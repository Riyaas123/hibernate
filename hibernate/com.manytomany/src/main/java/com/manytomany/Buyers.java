package com.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Buyers {
@Id
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Buyers() {
	super();
	// TODO Auto-generated constructor stub
}
public Buyers(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
