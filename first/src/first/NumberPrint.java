package first;
import java.util.*;
public class NumberPrint 
{

	public static void main(String[] args) 
	{
		String name;
		String surname;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the two string :");
		name=sc.nextLine();
		surname=sc.nextLine();
		String str=name.concat(" ").concat(surname);
		String reversed =" ";
	     
		int length1=name.length();
		System.out.println("name is"+ " "+str);
		System.out.println("reverse of name"+" " +reversed);
	}
}
