package com.nit;
import java.util.*;
public class Ulearn6 {

	public static void main(String[] args) 
	{
	LinkedHashSet<String> person=new LinkedHashSet<>();
	//ADD
	person.add("RAM");
	person.add("RAHUL");
	person.add("RIJU");
	for(String s:person)
	{
	System.out.println(s);
	}
	
	//UPDATE
	
	//REMOVE
	person.remove("RAHUL");
	for(String s:person)
	{
	System.out.println(s);
	}

	}

}
