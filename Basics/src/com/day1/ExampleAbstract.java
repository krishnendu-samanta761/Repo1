package com.day1;
abstract class Person
{
	String name;
	int id;
}
class Student extends Person
{
	public void test(String name, int id)
	{
		this.id=id;
		this.name=name;
		System.out.println(name+" "+id);
	}
}
class Teacher extends Person
{
	public void test1()
	{
		System.out.println(name+" "+id);
	}
}

public class ExampleAbstract
{
   public static void main(String[] args) 
   {
	   Student s=new Student();
	   Teacher t=new Teacher();
	   
	   t.name="Rahul";
	   t.id=2;
	   s.test("Riju",5);
	   t.test1();
		
	}

}
