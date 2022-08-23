package com.lambda;
import java.util.*;
public class LambdaList {

	public static void main(String[] args) 
	{
		List<Integer> num=new ArrayList<>();
        num.add(5);
        num.add(10);
        num.add(15);
        
        num.forEach((i)->System.out.println(i));
	}

}
