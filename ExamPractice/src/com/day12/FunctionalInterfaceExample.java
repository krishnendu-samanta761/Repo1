package com.day12;
import java.util.*;
import java.util.function.Consumer;
public class FunctionalInterfaceExample {

	public static void main(String[] args) 
	{
		List<Integer> name=new ArrayList<>();
		name.add(5);
		name.add(15);
		name.add(25);
		name.add(35);
		
		//name.forEach(i-> System.out.println(i));
		
		Consumer<Integer> name1=i-> System.out.println(i);
		name.forEach(name1);
	}

}
