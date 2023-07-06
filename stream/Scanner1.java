package com.rays.stream;

import java.io.FileReader;
import java.util.Scanner;

public class Scanner1 {
	
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\kkr\\java2.txt");
		Scanner sc = new Scanner(reader);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		reader.close();
	}
}
