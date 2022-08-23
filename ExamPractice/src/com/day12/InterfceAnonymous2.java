package com.day12;

abstract class Abs
{
	abstract void sum();
}

public class InterfceAnonymous2 
{

	public static void main(String[] args) 
	{
		Abs abs=new Abs() {
			public void sum()
			{
				System.out.println("Hello!");
			}
			
		};
      abs.sum();
	}

}
