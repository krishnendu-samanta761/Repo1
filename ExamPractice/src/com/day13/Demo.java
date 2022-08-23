package com.day13;

import java.util.HashMap;
import java.util.Map;
public class Demo 
{
    public static void main(String[] args) 
	{
    	HashMap<Integer, String> demo=new HashMap<>();
    	
    	demo.put(1, "R");
    	demo.put(2, "I");
    	demo.put(3, "J");
    	demo.put(4, "U");
    	
    	for(Map.Entry d:demo.entrySet())
    	{
    		System.out.println(d.getKey()+":"+d.getValue());
    	}

	}

}
