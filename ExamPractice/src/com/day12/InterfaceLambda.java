package com.day12;
interface I10
{
	void abc();
}
public class InterfaceLambda {

	public static void main(String[] args) 
	{
		int a=10;
	    I10 i=()->{System.out.println(a);};	
	    i.abc();
	}
	
}
