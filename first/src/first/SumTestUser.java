package first;
import java.util.*;
class Test
{
	public int sum(int a, int b)
	{
		return a+b;
	}
}

public class SumTestUser {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a :");
		System.out.println("enter the value of b :");
		a=sc.nextInt();
		b=sc.nextInt();
		Test test=new Test();
		int s=test.sum(a,b);
		System.out.println("  "+s);
        
	}

}
