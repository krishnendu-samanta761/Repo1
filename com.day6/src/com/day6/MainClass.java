package com.day6;

public class MainClass 
{

	public static void main(String[] args) 
	{
      Student s1=new Student();
      s1.age=25;
      s1.dept="ECE";
      s1.name="Krishnendu";
      
      Student s2=new Student();
      s2.age=35;
      s2.dept="CSE";
      s2.name="Rahul";
      s1.walk();
      s2.eat();
      s1.walk(5);
      //System.out.println(s1.age+" "+s1.dept+" "+s1.name);
      //System.out.println(s2.name+" "+s2.age+" "+s2.dept);
	}
}
	class Student
	{
		String name;
		int age;
		String dept;
		void eat()
		{
			System.out.println(name+" "+ "is eating");
		}
		void walk()
		{
			System.out.println(name+" "+ "is walking");
		}
		void walk(int steps)
		{
			System.out.println(name+" "+"is walking"+" "+steps+" "+"steps");
		}
	}


