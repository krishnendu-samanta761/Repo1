package com.day6;

public class Array {

	public static void main(String[] args) {
		int[] arr= {1,120,30,0,2,54,100,15};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{ 
	       if(arr[i]<min)
	      {
		    min=arr[i];
		  }
			
			
		 }
		System.out.println("minimum no is :"+" "+min);
	}
}
