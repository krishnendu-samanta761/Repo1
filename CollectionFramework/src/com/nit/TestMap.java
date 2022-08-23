package com.nit;
import java.util.*;
public class TestMap  {
		public static HashMap map(String[] rolls, String[] names)
		{
		    HashMap<String,String> map = new HashMap<>();
		    for (int i = 0; i < rolls.length; i++)
		    {
	        
	            map.put(rolls[i], names[i]);
		    }
	        return map;
		}
		

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of inputs you want to print");
			int a=sc.nextInt();
			String[] rolls = new String[a];

	        System.out.println("Enter the rolls");              

	        for (int i = 0; i <a;i++)
	        {
	            rolls[i] = sc.nextLine();


	        }
	        String[] names = new String[a];
	        System.out.println(" Enter the names");              

	        for (int i = 0; i <a;i++)
	        {

	            names[i] = sc.nextLine();


	        }

	       Map m=map(rolls,names);
	        Set<Map.Entry<String,String>> values=m.entrySet();
			for(Map.Entry<String,String> e : values)
			{
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}

	}




