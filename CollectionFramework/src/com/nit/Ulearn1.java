package com.nit;
import java.util.*;
public class Ulearn1 {

	public static void main(String[] args) 
	{
		LinkedList<String> name=new LinkedList<>();
		//ADD
		name.add("Krishnendu");
		name.add("Student");
		name.add("25");
		for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i));
		}
		
		//UPDATE
		name.set(0,"Riju");
		for(String s : name)
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
class Demo1
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
}
class Demo2 extends Demo1
{

	public int sum(int a,int b)
	{
		return a+b;
	}
}
