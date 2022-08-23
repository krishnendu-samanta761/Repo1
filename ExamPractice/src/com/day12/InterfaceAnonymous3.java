package com.day12;

interface I0
{
	void eat();
}

public class InterfaceAnonymous3 {

	public static void main(String[] args) 
	{
		I0 i0=new I0() {
	     public void eat()
	     {
	    	 System.out.println("eating....");
	     }
			
		};
      i0.eat();
	}

}
