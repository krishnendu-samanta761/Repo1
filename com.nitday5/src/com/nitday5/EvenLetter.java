
package com.nitday5;
import java.util.*;
public class EvenLetter 
{
	public static void main(String args[])
	{
	String name;
	char l = 0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name");
	name=sc.nextLine();
	for(int i=0;i<name.length();i++)
	{
		if(i%2==0)
		{
	l=name.charAt(i);
	System.out.println("even are :"+l);
		}
	
	}
	

    }
}
