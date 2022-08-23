package com.day8;

public class Duplicate {

	public static void main(String[] args) 
	{
		String name="Krishnendu";
		String a=name.toLowerCase();
		char duplicate[]=a.toCharArray();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(duplicate[i]==duplicate[j])
					count++;
			}
		}
		System.out.println(count);
	

	}

}
