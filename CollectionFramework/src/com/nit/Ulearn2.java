package com.nit;
import java.util.*;
public class Ulearn2 {

	public static void main(String[] args) 
	{
		HashMap<String,String> student=new HashMap<>();
		//ADD
		student.put("1", "School");
		student.put("2", "College");
		student.put("3", "Company");
		for(String s:student.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:student.values())
		{
		System.out.println("value :"+s1);	
		}
		
		//UPDATE
		student.put("2","Trainee");
		for(String s:student.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:student.values())
		{
		System.out.println("value :"+s1);	
		}
		//DELETE
		student.remove("2");
		for(String s:student.keySet())
		{
		System.out.println("key :"+s);
	    }
		for(String s1:student.values())
		{
			System.out.println("value :"+s1);
		}
}
}
