package com.day12;
@FunctionalInterface
interface I3
{
	void sum(int a, int b);
}
class B implements I3
{
	public void sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
public class InterfaceExample2 
{
   public static void main(String[] args) 
	{
	   B b=new B();
	   b.sum(10, 50);

	}

}
