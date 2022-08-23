package com.day1;

public class MethodOverloading 
{ 
	private int x,y;
	public void sum()
	{
		x=10; y=5;
		int s=x+y;
		System.out.println(s);
	}
	public void sum(int X,int Y)
	{
		x=X;y=Y;
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) 
	{
		MethodOverloading mo=new MethodOverloading();
		MethodOverloading mo1=new MethodOverloading(); 
		mo.sum();
		mo1.sum(5,6);
		

	}

}
