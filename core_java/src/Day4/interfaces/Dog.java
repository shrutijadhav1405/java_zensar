package Day4.interfaces;

public class Dog implements Animal
{

	@Override
	public void animalSound() 
	{
		System.out.println("Bow..bow");
		
	}

	@Override
	public void sleep() 
	{
		System.out.println("zzzz...");
		
	}

}
