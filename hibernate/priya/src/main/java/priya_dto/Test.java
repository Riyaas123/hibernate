package priya_dto;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Test {
	@Id
	@GeneratedValue
private int id;
	@Column(nullable=true)
	private String name;
	@Column(nullable=true,unique=true,length=10)
	private long phno;
	private String adress;
	private char gender;
	private int age;
	@Lob
	private byte[] image;
	@CreationTimestamp
	private Date objectTime;
	@UpdateTimestamp
	private Date updateTime;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getObjectTime() {
		return objectTime;
	}
	public void setObjectTime(Date objectTime) {
		this.objectTime = objectTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override 
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", phno=" + phno + ", adress=" + adress + ", gender=" + gender
				+ ", age=" + age + ", image=" + Arrays.toString(image) + ", objectTime=" + objectTime + ", updateTime="
				+ updateTime + "]";
	}
	
}
