package com.oops;
class Emp
{
	String name;
	void eat()
	{
	System.out.println(name+" "+"is eating");
	}
	void eat(int times)
	{
	System.out.println(name+" "+"is eating"+" "+times+" "+"times");
	}
			
}
public class OverRide extends Emp {
	
	@Override
	void eat(int times)
	{
		System.out.println("sub"+ times);
	}

       public static void main(String[] args) 
              {
				Emp e1=new OverRide();
		
				e1.name="Krishnendu";
				e1.eat(5);
				
				
              }

}



	

