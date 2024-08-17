package com.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String Name;
	private String email;
	private long phn;
	public int getId(int i) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", Name=" + Name + ", email=" + email + ", phn=" + phn + "]";
//	}
//	
}
