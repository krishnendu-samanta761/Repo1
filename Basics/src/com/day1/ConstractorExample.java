package com.day1;

public class ConstractorExample 
{
	private int l,b,h;
	public ConstractorExample()
	{
		l=5;b=7;h=10;
		System.out.println(l+" "+b+" "+h);
	}
	public ConstractorExample(int L,int B,int H)
	{
		l=L;b=B;h=H;
		int a=l*b*h;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		ConstractorExample obj=new ConstractorExample();
		ConstractorExample obj1=new ConstractorExample(2,3,4);

	}

}
