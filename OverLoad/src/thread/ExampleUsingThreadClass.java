package thread;
class X extends Thread
{
	public void run()
  {
     for(int i=0;i<5;i++)
	{
	 System.out.println("Thread of X :"+i);	
	}
   }
}
class Y extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
		System.out.println("Thread of Y :"+j);
		}
	}
}
public class ExampleUsingThreadClass 
{
public static void main(String[] args) 
	{
		X obj1=new X();
		Y obj2=new Y();
		obj1.start();
		obj2.start();

	}

}
