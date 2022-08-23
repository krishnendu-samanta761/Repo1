package com.nit;
import java.util.*;
public class Ulearn5 {

	public static void main(String[] args) 
	{
		Stack<String> str=new Stack<>();
		//ADD
		str.add("APPLE");
		str.add("MANGO");
		str.add("ORANGE");
		str.add("BANANA");
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		
		//UPDATE
		str.set(1, "PINAPLE");
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		
		//REMOVE
		str.removeAll(str);
		for(int i=0;i<str.size();i++)
		System.out.println(str.get(i));
		

	}

}
