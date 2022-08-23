package com.day1;

public class ExampleStatic 
{
	static int x;     //static member variable
	int y;            //instance member variable
	
	public void test()    //instance member method
	{
		y=5;
		System.out.println("value of y is: "+y);
	}
	public static void test1()    //static member method
	{
		x=10;
		System.out.println("value of x is: "+x);
	}
	
	static class Test  //static inner class
	{
		public static String country="INDIA";
		
	}
	
	class A  //instance inner class
	{
		int a=30;
	    public void test2()
	    {
	    	System.out.println("value of a is " +a);
	    }
	}

	public static void main(String[] args) 
	{
		ExampleStatic obj=new ExampleStatic();
		obj.test();
		obj.test1();
		
		ExampleStatic.A a1=new ExampleStatic(). new A();
		a1.test2();
		
		System.out.println(Test.country);
		

	}

}
