package com.hibernet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Demo {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akshay");
	System.out.println(factory);
} 
}