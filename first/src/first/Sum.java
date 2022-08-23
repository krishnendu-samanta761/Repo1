package first;
class A  // class name
{
	int a=4,b=5;   // variable declare
 private int add()  // method declare
{
	System.out.println("sum is : "+a+b);
	return a+b;    // return the value
}
}
 class B extends A
 {
 int c=4,d=10;
 int add()
 {
	return c+d; 
 }
 }
 
public class Sum   // main class name
{

	public static void main(String[] args)  // main method 
	{
		// TODO Auto-generated method stub
		B obj1= new B();  // object create of class 'A'
		int s=obj1.add();  // calling the method by object of class 'A'
		System.out.println(s); //print the output value

	}
}

