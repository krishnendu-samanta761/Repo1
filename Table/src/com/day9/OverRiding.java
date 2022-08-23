package com.day9;

public class OverRiding extends Student
 {
	@Override
	void play(int times)
	{
		System.out.println("plays footbal"+times);
	}

	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.name="Ram";
		s1.play(3);

	}

}
class Student
{
	String name;
	void play()
	{
		System.out.println(name+" "+" is playing football");
	}
	void play(int times)
	{
		System.out.println(name+" "+"plays"+" "+times+"times in a day");
	}
	
}
