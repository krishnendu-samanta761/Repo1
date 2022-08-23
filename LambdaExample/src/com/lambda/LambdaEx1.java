package com.lambda;
@FunctionalInterface
interface I1
{
  void test();	
}
public class LambdaEx1 
{
	public static void main(String[] args) 
	{
		String name="Krishnendu";
		
		I1 i1=()->{System.out.println(name);
		};
      i1.test();
	}

}
