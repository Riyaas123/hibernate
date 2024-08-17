package priya_controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import priya_dao.Demo;
import priya_dto.Test;

public class Sample {
public static void main(String[] args) throws IOException {
	Demo d=new Demo();
	Test t=new Test();
	t.setName("siya");
	t.setPhno(234324432412l);
	t.setAdress("jsdbvff");
	t.setGender('m');
	t.setAge(25);
FileInputStream f=new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\test.jpg");
byte[]arr=new byte[f.available()];
f.read(arr);
t.setImage(arr);
}
}
