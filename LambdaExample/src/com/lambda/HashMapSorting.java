package com.lambda;
import java.util.*;
import java.util.Map.Entry;
public class HashMapSorting {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> student=new HashMap<>();
		
		student.put("Rahul", 3);
		student.put("Rakesh", 4);
		student.put("Akash", 1);
		student.put("krish", 2);
		
		/*Set<String> keySet= student.keySet();  //getting the set of key from map
		List<String> keys=new ArrayList<String>(keySet);   //putting the set of key into arraylist
		
		Collection<Integer> values=student.values();
		List<Integer> value=new ArrayList<Integer>(values);
		
		System.out.println("keys are: "+keys);
		System.out.println("values are: "+value);
		
		Collections.sort(value);
		System.out.println("after sorting: "+value);
		
		Collections.sort(value, Collections.reverseOrder());
		System.out.println("reverse sorting: "+value);
		*/
		System.out.println("the map is : ");
		student.forEach((k,v)-> System.out.println(k+" "+v));
		
		Set<Entry<String,Integer>> entrySet=student.entrySet();
		
		List<Entry<String,Integer>> list=new ArrayList<>(entrySet);
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){
			
			@Override
			public int compare(Entry<String,Integer>l1,Entry<String,Integer>l2)
			{
				return l1.getValue().compareTo(l2.getValue());
			}
			
		});
		System.out.println("after sorting : ");
		list.forEach(s-> {System.out.println(s.getKey()+" "+s.getValue());});
		
	}  

	}


