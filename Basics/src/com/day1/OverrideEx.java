package com.day1;
class Abc
{
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
class Bcd extends Abc
{
	@Override
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum: "+c);
		super.sum(a, b);   // return the value of method sum(int a, int b) from class A
	}
}

public class OverrideEx {

	public static void main(String[] args) 
	{
		Bcd b=new Bcd();
		b.sum(5, 10);
	}

}
