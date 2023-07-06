package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class StrStr1 {
	public static void main(String[] args) {
		
		List<String>items = new ArrayList<String>();
		
		items.add("one");
		items.add("two");
		items.add("three");
		items.add("four");
		items.add("five");
		
		items.stream().sorted().forEach(e  -> { 
			System.out.println(e);
		});
		}
		
		
	}


