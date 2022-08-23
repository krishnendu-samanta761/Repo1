package com.nit;
import java.util.*;
public class Ulearn3 {

	public static void main(String[] args) 
	{
	 HashSet<Integer> num=new HashSet<>();
	 //ADD
	 num.add(10);
	 num.add(15);
	 num.add(20);
	 num.add(15);
	 for(int i:num)
	 {
		 System.out.println(i+" "); 
	 }
	
     //UPDATE
     //REMOVE
	 num.remove(10);
	 for(int i:num)
	 {
	 System.out.println(i+" ");
	 }
}
}
