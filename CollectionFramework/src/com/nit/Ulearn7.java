package com.nit;
import java.io.*;
import java.util.*;
public class Ulearn7 {

	public static void main(String[] args)throws IOException 
	{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number that you want to print :");
		int num=Integer.parseInt(br.readLine());
		
		String[] id= new String[num];
		System.out.println("enter the id :");
	    for(i=0;i<num;i++)
		{
		id[i]=br.readLine();
		System.out.println("enter the id:"+id[i]);
		}
		for(i=0;i<num;i++)
        System.out.println("enter the id:"+id[i]);
		
		String[] name=new String[num];
		System.out.println("enter the name :");
		for(i=0;i<num;i++)
		{
			name[i]=br.readLine();
		}
		for(i=0;i<num;i++)
	    System.out.println("enter the name:"+name[i]);
		
		/*HashMap<String,String> student=new HashMap<>();
		student.put("id","name");
		Set<Map.Entry<String,String>> values=student.entrySet();
		for(Map.Entry<String,String> e : values)
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}*/
		/*for (Map.Entry<String, Integer> en : num.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }*/
		
	}
	
	}

	


