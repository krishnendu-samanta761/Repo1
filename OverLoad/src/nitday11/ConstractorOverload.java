package nitday11;

public class ConstractorOverload 
{
	int id;
	String name;
	public ConstractorOverload()
	{
		//System.out.println("This is a default constarctor");	
	}
	public ConstractorOverload(int a,String n)
	{
		id=a;
		name=n;
		//System.out.println(" id : "+a+" "+name);
		
	}

	public static void main(String[] args) 
	{
		ConstractorOverload obj=new ConstractorOverload();
		System.out.println("parameterized constractor is :" +obj.id+" "+obj.name);
		
		ConstractorOverload obj1=new ConstractorOverload(1,"Krishnendu");
		System.out.println("parameterized constractor is :"+obj1.id+" "+obj1.name);
		
		
		Box b1=new Box();
		//System.out.println(b1.l+" "+b1.b+" "+b1.h);
		b1.sum();
		System.out.println(b1.l+" "+b1.b+" "+b1.h);
		//Box b2=new Box(10,15,20);
		//System.out.println(b2.l+" "+b2.b+" "+b2.h);
		b1.sum(5, 3, 8);
		System.out.println(b1.l+" "+b1.b+" "+b1.h);

	}

}

class Box
{
	int l,b,h;
	public void sum()
	{
		l=5;
		b=4;
		h=2;
	}
	public void sum(int L, int B, int H)
	{
	 l=L;
	 b=B;
	 h=H;
	}
}
