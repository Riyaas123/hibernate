package Randomnumber.Dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(unique=true,nullable=true)
	private long no;
	private String systemGeneratedNo;
	private String userEnteredNo;
	@CreationTimestamp
	private Date dateAndTime;
	private int points;
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
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getSystemGeneratedNo() {
		return systemGeneratedNo;
	}
	public void setSystemGeneratedNo(String systemGeneratedNo) {
		this.systemGeneratedNo = systemGeneratedNo;
	}
	public String getUserEnteredNo() {
		return userEnteredNo;
	}
	public void setUserEnteredNo(String userEnteredNo) {
		this.userEnteredNo = userEnteredNo;
	}
	public Date getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", no=" + no + ", systemGeneratedNo=" + systemGeneratedNo
				+ ", userEnteredNo=" + userEnteredNo + ", dateAndTime=" + dateAndTime + ", points=" + points + "]";
	}
	
	
	
}
