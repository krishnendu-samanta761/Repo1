package com.nit;
import java.util.*;
public class Ulearn {

	public static void main(String[] args) 
	{
		ArrayList<String> name=new ArrayList<>();
		//ADD
		name.add("Krishnendu");
		name.add("Tarakeswar");
		name.add("8145601746");
		for(int i=0;i<name.size();i++)
		{
		System.out.println(name.get(i));
		}
		//UPDATE

		name.set(1,"Kolkata");
		for(String s:name)
		{
			System.out.println(s);
		}
		//DELETE
		name.remove(2);
		for(String s:name)
		{
			System.out.println(s);
		}
		}
	}
