package com.lambda;
@FunctionalInterface
interface I3
{
	int sum1(int a,int b);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		I3 i4=(a,b)->(a+b);{
			System.out.println(i4.sum1(5, 10));
		};

	}

}
