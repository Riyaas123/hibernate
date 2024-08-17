package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Brand {
@Id 
private int mfg_id;
private String name;
private int price;
@ManyToMany
private List<Buyers>Buyer;
public int getMfg_id() {
	return mfg_id;
}
public void setMfg_id(int mfg_id) {
	this.mfg_id = mfg_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public List<Buyers> getBuyer() {
	return Buyer;
}
public void setBuyer(List<Buyers> buyer) {
	Buyer = buyer;
}
public Brand() {
	super();
	// TODO Auto-generated constructor stub
}
public Brand(int mfg_id, String name, int price, List<Buyers> buyer) {
	super();
	this.mfg_id = mfg_id;
	this.name = name;
	this.price = price;
	Buyer = buyer;
}

}
