package StringManipulation;
import java.util.*;
public class Concat 
{

	public static void main(String[] args) 
	{
		String name;
		String surname;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name :");
		System.out.println("enter the surname : ");
		name=sc.nextLine();
		surname=sc.nextLine();
		String str=name.concat(" ").concat(surname);
		System.out.println(" the concation is :"+" "+str);
	}

}
