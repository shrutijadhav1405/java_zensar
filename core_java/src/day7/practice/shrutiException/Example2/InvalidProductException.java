package day7.practice.shrutiException.Example2;

public class InvalidProductException extends Exception
{
	public InvalidProductException()
	{
		System.out.println("Product not up to the mark");
	}
	
	public InvalidProductException(String msg)
	{
		System.out.println(msg);
	}
}
