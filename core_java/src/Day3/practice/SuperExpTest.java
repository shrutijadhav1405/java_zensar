package Day3.practice;

public class SuperExpTest extends SuperExp
{
	String name = "Robin";
	
	void hii()
	{
		System.out.println("Hiiii of SuperExpTest");
	}
	
	void hello()
	{
		System.out.println("Hello of SuperExpTest");
	}
	
	void displayMethods()
	{
		super.hii();
		hii();
		hello();
	}
	
	void displayName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

}
