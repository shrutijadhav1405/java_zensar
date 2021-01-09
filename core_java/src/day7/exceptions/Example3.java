package day7.exceptions;
// demo for thorws keyword
public class Example3 {

	public static void chechAge(int age) throws Exception
	{
		if(age < 18)
		{
			throw new Exception("Access denied");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) 
	{
		try 
		{
			chechAge(15);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong: " + e.getMessage() + " " + e);
		}

	}

}
