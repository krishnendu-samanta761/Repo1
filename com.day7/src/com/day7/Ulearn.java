package com.day7;
import java.util.*;
public class Ulearn 
{
	//Scanner sc= new Scanner(System.in);
 
	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		  obj.add("Krishnendu");
		  obj.add("tarakeswar");
		  obj.add("794561230");
		  
		  for(int i=0;i<obj.size();i++)
		  {
			System.out.println(obj.get(i));
		  }

		
		obj.set(1,"kolkata");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		obj.remove(0);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	
}
}