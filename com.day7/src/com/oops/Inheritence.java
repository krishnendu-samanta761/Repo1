package com.oops;

public class Inheritence
{

	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.name="Krishnrendu";
		p1.age=25;
		
		Person p2=new Person();
		p2.name="Riju";
		p2.age=26;
		
		//System.out.println(p1.name+" "+p1.age);
		//System.out.println(p2.name+" "+p2.age);
		
		//p1.walk();
		p2.eat();
		p1.walk(5);
	}
}
class Person
{
	String name;
	int age;
	void walk()
	{
		System.out.println(name+" is walking");
	}
	void eat()
	{
		System.out.println(name+" is eating");
	}
	void walk(int step)
	{
		System.out.println(name+" is walking "+step+" steps");
	}
}
