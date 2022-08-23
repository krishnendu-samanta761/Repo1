package com.hashmap;
import java.util.*;

public class ListExample {

	public static void main(String[] args) 
	{
		List<Integer> num=Arrays.asList(122,185,50,20,108,30,10,21,101);
		
		String c=null;
		for(int i=0;i<num.size();i++)
		{
			String number=num.get(i).toString();
			for(int j=0;j<number.length();j++)
			{
				if(number.indexOf(0)==1)
				{
					c=number;
				}
				if(c!=number)
				{
					continue;
				}
				System.out.println(c);
			}
		}
		
		
	}

}
