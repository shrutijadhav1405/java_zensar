package day7.exceptions;
// demo for thorw keyword
public class Example2 {

	public static void chechAge(int age) 
	{
		if(age < 10)
		{
			throw new ArithmeticException("Access denied");
		}
		else
		{
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args)  
	{
		chechAge(90);

	}

}
