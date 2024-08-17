package Randomnumber.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Randomnumber.Dao.UserDao;
import Randomnumber.Dto.User;

public class MainClass {
public static void main(String[] args) {
  Random r=new Random();
  int no[]=new int[5];
  for(int i=0;i<5;i++){
	  no[i]=r.nextInt(10);
  }
  Scanner sc=new Scanner(System.in);
  UserDao dao=new UserDao();
  User u=new User();
  System.out.println("enter the name");
  u.setName(sc.next());
  System.out.println("enter the ph no");
  u.setNo(sc.nextLong());
//  ..core java logics to generate random number...//
  System.out.println("guess the no");
	int points=0;
	int uno[]=new int[5];
	
	for(int i=0;i<5;i++){
		uno[i]=sc.nextInt();
		if(no[i]==uno[i]){
			points=points+10;
			System.out.println("good");
		}
		else{
			System.out.println("oops wrong ans");
		}
	}
	System.out.println("system generated number"+Arrays.toString(no));
	System.out.println("user entered number"+Arrays.toString(uno));
	System.out.println("total points="+points);
	System.out.println("////////////");
	u.setSystemGeneratedNo(Arrays.toString(no));
	u.setUserEnteredNo(Arrays.toString(uno));
	u.setPoints(points);
	dao.addObjects(u);
}
}
