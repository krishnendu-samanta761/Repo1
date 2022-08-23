package com.day13;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface Sum {
	void sum(List<Integer> list);
}


public class SumTest {
	public static void main(String[] args) {
		int i;
		List<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(11);
		num.add(10);
		num.add(3);
		num.add(8);
		num.add(12);
         
		List<Integer> l = new ArrayList<>();
		for (i = 0; i < num.size(); i++) {
			if (num.get(i) % 2 != 0) 
			{
				System.out.println(num.get(i));
				l.add(num.get(i));
			  }
           }
		
		Sum s = (abc) -> {
			int count = 0;
			for (int j : abc )
			{
				count += j;
			}
			System.out.println("Add of odd number is " + count);
		};
		s.sum(l);

	}

}



