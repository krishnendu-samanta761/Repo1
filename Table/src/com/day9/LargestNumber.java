package com.day9;

public class LargestNumber {
	static int arr[]= {5,8,15,32,85,45,8,4};
	static int largest()
	{
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>arr[0])
			max=arr[i];
	}
	return max;
	}
	public static void main(String[] args) 
	{
		
       System.out.println("largest number is :"+largest());

	}

}
