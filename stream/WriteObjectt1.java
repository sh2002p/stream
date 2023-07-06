package com.rays.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObjectt1 {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\kkr\\shradha.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet1 m = new Marksheet1();
		m.name = "Ram";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 95;
		
		out.writeObject(m);
		out.close();
		file.close();
	}
}
