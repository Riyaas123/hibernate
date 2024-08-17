package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.security.auth.Subject;

@Entity
public class Student {
@Id
private int id;
private String name;
@ManyToOne
private Subject subject;
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
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}
public Student(int id, String name, Subject subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
}
}
