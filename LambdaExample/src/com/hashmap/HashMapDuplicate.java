package com.hashmap;
import java.util.*;
import java.util.Map.Entry;
public class HashMapDuplicate {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Rahul", 1);
		map.put("Rakesh", 3);
		map.put("Akash", 3);
		map.put("Krish", 1);
		map.put("Riju", 2);
		map.put("Suvo", 4);
		
		System.out.println("The map is: ");
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
		Set<Entry<String,Integer>> mapSet= map.entrySet();

        
	}

}
