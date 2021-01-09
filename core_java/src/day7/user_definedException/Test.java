package day7.user_definedException;
// demo for thorw keyword
public class Test {

	public static void chechAge(int age) throws AgeNotValidException
	{
		if(age < 18)
		{
			throw new AgeNotValidException("Access denied");
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
			e.printStackTrace();
		}

	}

}
