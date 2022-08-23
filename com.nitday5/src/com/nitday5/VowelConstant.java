package com.nitday5;

public class VowelConstant {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int COUNT1=0, COUNT2=0;
		String name="My Name Is Krishnendu samanta";
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++)
		{
if(name.charAt(i)=='a'|| name.charAt(i)=='e'|| name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
	{
	COUNT1++;
	}
else if(name.charAt(i)>'a' && name.charAt(i)<'z')
	{
	COUNT2++;
	}
		}	
		
System.out.println("Vowels :" +COUNT1);
System.out.println("Constant :" +COUNT2);
	}

}
