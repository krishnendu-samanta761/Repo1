package com.lambda;
@FunctionalInterface
interface I
{
	void draw();
}

public class AnonomyousInnerClassEx 
{
   public static void main(String[] args) 
   {
		int a=10;
		I i=new I() {
			public void draw()
			{
				System.out.println(a);
			}
		};i.draw();
	}	
			
}
