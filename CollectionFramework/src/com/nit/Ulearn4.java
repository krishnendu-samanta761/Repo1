package com.nit;
import java.util.*;
public class Ulearn4 {

	public static void main(String[] args) 
	{
		Vector<Integer> number=new Vector<>();
		//ADD
		number.add(50);
		number.add(70);
		number.add(30);
		for(int i=0;i<number.size();i++)
		{
		System.out.println(number.get(i));
		}
		//UPDATE
		number.set(1,10);
		for(int i=0;i<number.size();i++)
		{
			System.out.println(number.get(i));
		}
		//DELETE
		number.remove(2);
		for(int i:number)
		{
			System.out.println(i);
		}
		

	}

}
