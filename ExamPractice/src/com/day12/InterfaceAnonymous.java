package com.day12;
interface Demo1
{
	void abc1(int n);
}
public class InterfaceAnonymous
{
     public static void main(String[] args) 
	{
    	 Demo1 d=new Demo1()
    	{
    		//int n=10;
    		public void abc1(int n)
    		{
    		System.out.println(n);	
    		}
    		 
    	};
    	d.abc1(10); 
    }
}
		

