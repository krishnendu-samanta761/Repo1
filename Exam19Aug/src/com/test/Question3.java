package com.test;
import java.util.*;
public class Question3 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> student=new HashMap<>();
		
		  student.put("1", "Rahul");
		  student.put("2", "Ram");
		  student.put("3", "Krishnednu");
		  
		HashMap<String,String> animal=new HashMap<>();
		
		  animal.put("10","Tiger" );
		  animal.put("15", "Lion");
		  animal.put("20", "Cow");
		
		  animal.putAll(student);
		
		
		for(Map.Entry s : animal.entrySet())
		  {    
			System.out.println(s.getKey()+": "+s.getValue());  
		  }
		
		/*for(String s:animal.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:animal.values())
		{
		System.out.println("value :"+s1);
		}
		//System.out.println(animal);*/
		
	   }

}
