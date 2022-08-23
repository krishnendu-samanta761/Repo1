package first;

public class NameAlternate {

	public static void main(String[] args) 
	{
		String name ="KrIsHnEnDu";
		String store=" ";
		System.out.println("initial name is: " +name);
		//name=name.toLowerCase();
		for(int i=0; i<=name.length()-1; i++)
		{
		if(name.charAt(i)>='a' && name.charAt(i)<='z')
		{
			store+=(char)(name.charAt(i)-32);
		}
		else
		{
			store+=(char)(name.charAt(i)+32);
		}
			
		}
		System.out.println("new name is :"+store);
		


	}

}
