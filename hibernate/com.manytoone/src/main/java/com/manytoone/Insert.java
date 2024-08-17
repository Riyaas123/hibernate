package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("riyaas");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	Subject subject=new Subject();
	subject.setSub_id(101);
	subject.setName("core java");
	
	Student student=new Student();
	student.setId(1);
	student.setName("ria");
	student.setSubject(subject);
	
	Student student1=new Student();
	student1.setId(2);
	student1.setName("nelson");
	student1.setSubject(subject);
	
	Student student2=new Student();
	student2.setId(3);
	student2.setName("nino");
	student2.setSubject(subject);
	
	Student student3=new Student();
	student3.setId(4);
	student3.setName("sultan");
	student3.setSubject(subject);

	transaction.begin();
	manager.persist(subject);
	manager.persist(student);
	manager.persist(student1);
	manager.persist(student2);
	manager.persist(student3);
	transaction.commit();
}
}
