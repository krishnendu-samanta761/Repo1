package com.day12;
interface Picture
{
  void draw();	
}
class Rectangle implements Picture
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
class Circle implements Picture
{
	public void draw()
	{
		System.out.println("Circle");
	}
	public void test()
	{
		System.out.println("Test");
	}
}

public class InterfaceExample3 
{

	public static void main(String[] args) 
	{
	Picture p  =new Rectangle();
	Picture p1 =new Circle();
	Circle  p3 =new Circle();
	p.draw();
	p1.draw();
	p3.test();
	}

}
