package nitday11;

class Student
{
	String name;
	
	void play(int i)
	{
		System.out.println(name+" "+"is playing cricket"+" "+i+"times");
	}
	
}

public class MethodOverride extends Student
{
	@Override
	void play(int i)
	{
		System.out.println(name+" "+"play"+" "+i+" "+"times" );
	}
	
    public static void main(String[] args) 
    {
    	Student s=new Student();
    	s.name="Rahul";
    	s.play(2);
	 

	}

}
