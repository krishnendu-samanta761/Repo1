package com.nit;

import java.util.*;

public class Implementation {

	public Implementation() {
		ArrayList<String> name=new ArrayList<>();
		name.add("AA");
		name.add("BB");
		name.add("CC");
		name.add("ee");
		
		Iterator itr=name.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
	}
	
	}
}
