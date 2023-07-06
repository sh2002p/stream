package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStr2 {
	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		
		items.add("one");
		items.add("two");
		items.add("three");
		items.add("four");
		items.add("five");
		
		items.stream().map(e -> 
		e.toUpperCase()).forEach(e ->  {
			System.out.println(e);
		});
		}
		
	}

