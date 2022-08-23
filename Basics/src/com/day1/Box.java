package com.day1;
class Area
{
	int length,bredth,height;
	public void setDimension(int l,int b,int h) 
	{
		length=l;
		bredth=b;
		height=h;
	}
	public void showdemension()
	{
		System.out.println(length+" "+bredth+" "+height);
	}
}
public class Box
{
	public static void main(String[] args) 
	{
		Area a=new Area();
		a.setDimension(2, 5, 7);
		a.showdemension();
	}

}
