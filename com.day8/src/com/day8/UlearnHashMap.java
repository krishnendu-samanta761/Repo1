package com.day8;
import java.util.*;
public class UlearnHashMap {

	public static void main(String[] args)
	{
		Map<String,String> student=new HashMap<>();
		//ADD
		student.put("instname","NIT");
		student.put("instadds","KOLKATA");
		student.put("instmobile","789456123" );
		System.out.println(student);
		
		//UPDATE
		student.put("instmobile","987456123");
		System.out.println(student);
		
		//REMOVE
		student.remove("instname");
		System.out.println(student);
		
		

	}

}
