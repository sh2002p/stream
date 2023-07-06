package com.rays.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadObject3 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\ASUS\\Desktop\\kkr\\Shradha.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet1 m = (Marksheet1)in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		
		in.close();
		file.close();
		

;		
	}

}
