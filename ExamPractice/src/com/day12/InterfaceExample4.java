package com.day12;
interface I5
{
	void test();
}
interface I6 extends I5
{
	void eat();
}
class D implements I6
{
	public void test()
	{
		System.out.println("Hello");
	}
	public void eat()
	{
	System.out.println("Welcome");	
	}
}
public class InterfaceExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       D d=new D();
       d.eat();
       d.test();
	}

}
