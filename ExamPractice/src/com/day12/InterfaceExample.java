package com.day12;
interface I
{
	void sum();
	
}
class A implements I
{
	public void sum()
	{
	System.out.println("Hello!!");
		
	}
}
public class InterfaceExample 
{
    public static void main(String[] args) 
	{
	   A obj=new A();
	   obj.sum();
	   //System.out.println(obj.sum());

	}

}
