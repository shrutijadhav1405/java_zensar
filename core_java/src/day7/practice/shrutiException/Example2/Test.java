package day7.practice.shrutiException.Example2;

public class Test {

	public static void checkProduct(int weight) throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException();
		}
		else
		{
			System.out.println("Product approved");
		}
	} 
	
	public static void main(String[] args) 
	{
		try
		{
			checkProduct(50);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
