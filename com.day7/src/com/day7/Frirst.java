package com.day7;
import java.util.*;
public class Frirst 
	{
	public static void main(String args[])
	{
	  List<String>name=new ArrayList();
	   name.add("Krishnendu");
	   name.add("Samanta");
	   System.out.println(name);
	  
	   name.add("Riju");
	   System.out.println(name);
	  
	   name.add(1,"Rahul");
	   System.out.println(name);
	  
	   List<String>name1=new ArrayList();
	   name1.add("abc");
	   name1.add("pqr");
	   name.addAll(name1);
	   
	   System.out.println(name);
	  System.out.println(name.get(2));
	  name.remove(0);
	  System.out.println(name);
	  name.set(2,"mno");
	  System.out.println(name);
	  System.out.println(name.size());
	   }

	   
	   } 



	
	
	
	
	
	

