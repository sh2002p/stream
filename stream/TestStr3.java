package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStr3 {
	public static void main(String[] args) {
		
		List<String>items = new ArrayList<String>() ;
		
		items.add("one");
		items.add("Two");
		items.add("Three");
		items.add("Four");
		items.add("Five");
		
		items.stream().filter(e ->
		e.startsWith("F")).distinct().map(e -> 
		e.toUpperCase()).sorted().forEach(e ->  {
			System.out.println(e);
		});
		}
				
	}


