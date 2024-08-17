package trryyy;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class mainclass {
	@Id
private int id;
private String name;
private String email;
private long phn;
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
public mainclass() {
	super();
	// TODO Auto-generated constructor stub
}

}