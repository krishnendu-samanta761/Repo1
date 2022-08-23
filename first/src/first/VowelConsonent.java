package first;

public class VowelConsonent {

	public static void main(String[] args) {
	String name="krishnendu samanta";
	System.out.println("print the name:");
    int	COUNT1=0,COUNT2=0;
    for(int i=0;i<name.length();i++)
    {
	if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
	{
	COUNT1++;	
	}
	else if(name.charAt(i)==' ')
	{
	continue;	
	}
		
	else
	{
    COUNT2++;
	}
	}
    System.out.println("vowels:" +COUNT1);
    System.out.println("consonent: "+COUNT2);
	}
}

