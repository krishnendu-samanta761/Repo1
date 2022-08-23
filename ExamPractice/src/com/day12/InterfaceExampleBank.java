package com.day12;
interface Bank
{
	float rateOfInterest();
}
class Sbi implements Bank
{
	public float rateOfInterest()
	{
		return 15.5f;
	}
}
class Boi implements Bank
{
	public float rateOfInterest()
	{
		return 10.8f;
	}
}
public class InterfaceExampleBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bank b2=new Sbi();
       Bank b3=new Boi();
       System.out.println(b2.rateOfInterest());
       System.out.println(b3.rateOfInterest());
	}

}
