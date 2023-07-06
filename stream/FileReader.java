package com.rays.stream;

import java.io.FileReader;

class TextReader {
	
	public static void main(String[] args) throws Exception{
		
	FileReader in = new FileReader("C:\\Users\\ASUS\\Desktop\\spamr\\Stream.txt");
		int ch = in.read();
		while(ch != -1) {
			System.out.println((char)ch);
ch = in.read();
		}
	}

}
