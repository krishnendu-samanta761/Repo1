package com.day1;

class A
{
	public void f1(int a)
	{
		System.out.println("A is : "+a);
	}
	public void f1(int a,int b)
	{
		System.out.println(a+" "+b);
	}
}
class B extends A
{
	public void f1()
	{
		System.out.println("Hello");
	}
}

public class OverloadFromDifferentClass
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.f1();
		b.f1(10);
		b.f1(5, 10);

	}

}
