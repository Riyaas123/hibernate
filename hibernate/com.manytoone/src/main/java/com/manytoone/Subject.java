package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
@Id
private int sub_id;
private String name;
public int getSub_id() {
	return sub_id;
}
public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Subject() {
	super();
	// TODO Auto-generated constructor stub
}
public Subject(int sub_id, String name) {
	super();
	this.sub_id = sub_id;
	this.name = name;
}
@Override
public String toString() {
	return "Subject [sub_id=" + sub_id + ", name=" + name + "]";
}
}
