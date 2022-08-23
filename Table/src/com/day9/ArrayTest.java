package com.day9;
import java.util.*;
public class ArrayTest {

	public static void main(String[] args) 
	{
		int arr[]= {2,7,8,54,78};
		//Arrays.sort(arr);
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
	     if(arr[i]>max)
	     {
	    	 max=arr[i];
	     }
		}
		System.out.println(max);
		
		  
		}

	}


