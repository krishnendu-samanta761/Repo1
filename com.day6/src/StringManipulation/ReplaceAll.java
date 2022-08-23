package StringManipulation;

public class ReplaceAll {

	public static void main(String[] args) 
	{
		String name="My name is Krishnendu Samanta";
		String str=name.replaceFirst("M","Z");
		String str1=name.replaceAll("n","v");
		System.out.println(str);
		System.out.println(str1);
		

	}

}
