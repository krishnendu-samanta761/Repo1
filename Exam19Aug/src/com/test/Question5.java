package com.test;
import java.util.*;
public class Question5 {

	public static void main(String[] args) 
	{
		List<String> student=new ArrayList<>();
		  
		  student.add("Rahul");
		  student.add("Ram");
		  student.add("Krishnednu");
		  
		  for(String s:student)
		  {
			  System.out.println(s);
		  }
		  
		  //UPDATE
		  
		  student.add(0, "Akash");
		  for(String s:student)
		  {
			  System.out.println(s);
		  }
		 }
	}
