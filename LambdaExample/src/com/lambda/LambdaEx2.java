package com.lambda;
@FunctionalInterface
interface I2
{
	int sum(int a, int b);
}
public class LambdaEx2 {

	public static void main(String[] args) 
	{
		I2 i2=(m,n)->{
			return m+n;
			 };
		System.out.println(i2.sum(15,15));
		
		I2 i3=(b,c)->{
			return (b+c);
		};
		System.out.println(i3.sum(5, 10));
	}

}
