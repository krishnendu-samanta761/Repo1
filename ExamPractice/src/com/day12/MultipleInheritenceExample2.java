package com.day12;
interface Printable
{
	int print();
}
interface Showable
{
	void show();
}
class K implements Printable,Showable
{
  public int print()
{
	  return 15;
}
  public void show()
   {
	   System.out.println("show");
   }
}
public class MultipleInheritenceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       K k=new K();
       k.show();
       System.out.println(k.print());
	}

}
