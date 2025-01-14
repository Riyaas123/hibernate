package practice.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Practice {
	@Id
	@GeneratedValue
private int id;
private String name;
@Column(nullable=true,unique=true)
private String email;
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
public Practice() {
	super();
	// TODO Auto-generated constructor stub
}

}
