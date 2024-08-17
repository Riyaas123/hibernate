package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
private int id;
	@Column(nullable=true)
private String name;
	@Column(unique=true)
private Long phno;
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
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + "]";
}
}
