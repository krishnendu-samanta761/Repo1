package StringManipulation;
import java.util.*;
public class CharAt {

	public static void main(String[] args) 
	{
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the name :");
		name=sc.nextLine();
		System.out.println(" enter the letter whose position you are searching :");
		char ch=sc.next().charAt(0);
		int index=name.indexOf(ch);
		System.out.println(" index is :"+" "+index);


	}

}
