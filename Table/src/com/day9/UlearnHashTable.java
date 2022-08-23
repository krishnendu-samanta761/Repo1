package com.day9;
import java.util.*;
public class UlearnHashTable {

	public static void main(String[] args)
	{
		Hashtable<String, String> set=new Hashtable<>();
		//ADD
		set.put("InstituteName", "NIT SOLUTION");
		set.put("InstituteAddress", "DUNLOP");
		set.put("InstituteMobile", "123466987");
		for(String s:set.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1: set.values())
		{
			//System.out.println("value :"+s1);
			System.out.println("value :"+s1);
		}
		//UPDATE
		set.put("InstituteAddress", "KOLKATA");
		for(String s:set.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:set.values())
		{
		System.out.println("value :"+s1);
		}
		//REMOVE
		set.remove("InstituteAddress");
		for(String s:set.keySet())
		{
		System.out.println("key :"+s);
		}
		for(String s1:set.values())
		{
			System.out.println("value :"+s1);
		}
		

	}

}
