package com.day13;

public class ArrayPrint {

	public static void main(String[] args) 
	{
		int i,sum=0;
        int[] arr= {1,3,8,4,12,6};
        for(i=0;i<arr.length;i++)
     {
	if(arr[i]%2!=0)
	  {
		sum=sum+arr[i];
	  }
	}
        System.out.println(sum);
	}
}
