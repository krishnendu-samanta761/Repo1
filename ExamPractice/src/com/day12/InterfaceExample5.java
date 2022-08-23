package com.day12;

interface I8
{
	int sum(int a, int b);
}
class C implements I8
{
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
}
public class InterfaceExample5
{
   public static void main(String[] args) 
	{
	   C b=new C();
	   
	   System.out.println(b.sum(10, 50));

	}

}
