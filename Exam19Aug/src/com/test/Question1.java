package com.test;
import java.util.*;
public class Question1 
{

	public static void main(String[] args) 
	{
	  HashMap<String,String> student=new HashMap<>();
	  
	  student.put("1", "Rahul");
	  student.put("2", "Ram");
	  student.put("3", "Krishnednu");
	  student.put("4", "Riju");
	  
	 
	  /*for(String s:student.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:student.values())
		{
		System.out.println("value :"+s1);	
		}*/
	  for(Map.Entry s : student.entrySet())
	  {    
		System.out.println(s.getKey()+": "+s.getValue());  
	  }
	  }
}
