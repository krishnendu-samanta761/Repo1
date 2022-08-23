package StringManipulation;

public class IndexOf {

	public static void main(String[] args) 
	{
		        int count=0,startform=0;
			    String str ="hello welcome to NIT";
			    String name="My name is Krishnendu Samanta";
			    int index1=str.indexOf("welcome");
			    int index2= str.indexOf('e',5);
			    int index3= str.indexOf('N');
			    for(;;)
			    {
			    int index4=name.indexOf('n',startform);
			     
			    if(index4>=0)
			    {
			    	count++;
			    	startform=index4+1;
			    }
			    else
			    {
			     break;
			    }
			    }
			    System.out.println(index1+" "+index2+" "+index3);
			    System.out.println(" the string is :"+name);
			    System.out.println(" numbers of n :"+" "+count);
			    }
			  }
			


	


