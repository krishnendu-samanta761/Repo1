package StringManipulation;
import java.util.*;
public class Length {

	public static void main(String[] args) 
	{
		String s1;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string: ");
		s1=sc.nextLine();
		int length=s1.length();
		s1=s1.toUpperCase();		
		System.out.println("length of the string is :"+" "+length);
		System.out.println("lower case is :"+" "+s1);
		 }  
	}


