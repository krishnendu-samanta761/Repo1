package com.day12;

interface Drawable
{
	void draw();
}
public class InterfaceLambda1 
{
    public static void main(String[] args) 
    {
	 Drawable d0=()->{
	System.out.println("drawing");	 
	 };
   d0.draw();
	}

}
