package day7.user_definedException;

public class AgeNotValidException extends Exception
{
	//default constructor
	
	public AgeNotValidException()
	{
		System.out.println("Age must be more than 18");
	}
	
	//parameterized constructor
	
	public AgeNotValidException(String message)
	{
		System.out.println(message);
	}
	
}
