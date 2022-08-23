package thread;
class A implements Runnable
{
 int i;
 public void run()
 {
for(i=0;i<=5;i++)
  {
	System.out.println("Thread A is :"+" "+i);
  }
 }
}
class B implements Runnable
{
	int i;
	public void run()
	{
		for(i=0;i<=5;i++)
		{
		System.out.println("Thread B is :"+" "+i);
	    }
	}
}
public class Example 
{

	public static void main(String[] args) 
	{
		/*A a=new A();
		B b=new B();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);*/
		
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		
		t1.start();
		t2.start();

	}

}

