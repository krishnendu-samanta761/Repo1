package com.day12;
interface I1
{
	void play();
}
interface I2
{
	void sum();
}
class Student implements I1,I2
{
	public void play()
	{
	System.out.println("playing..");	
	}
	public void sum()
	{
		System.out.println("sum is..");
	}
	public void test()
	{
		System.out.println("test");
	}
}
public class MultipleInheritenceExample 
{
    public static void main(String[] args) 
	{
    	Student s=new Student();
    	
    	s.play();
    	s.sum();
    	s.test();

	}

}
