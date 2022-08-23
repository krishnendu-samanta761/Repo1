package com.day9;

public class SecondLargest {
  public static int seclarg(int[] arr, int size)
	{
		int temp=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		for(int k=0;k<size;k++)
		{
		System.out.println(arr[k]);
		}
	
	return arr[size-2];	
	}
	public static void main(String[] args) 
	{
	int arr[]={7,85,31,20,25};
	int size=arr.length;
	 System.out.println("number is :"+seclarg(arr,size)); 
	}

}
