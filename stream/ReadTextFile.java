package com.rays.stream;

import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) throws Exception{
		
		FileReader in = new FileReader ("C:\\Users\\ASUS\\Desktop\\kkr\\how.txt");
		
		int ch = in.read();
		while (ch !=-1){
			System.out.println((char)ch);
			ch = in .read();
			
		}
		in.close();
		
		
	} 
	

}
