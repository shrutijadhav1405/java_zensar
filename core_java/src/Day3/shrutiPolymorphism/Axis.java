package Day3.shrutiPolymorphism;

public class Axis extends Bank
{
	public void interestRate()
	{
		System.out.println("Axis Bank interest rate = 2.5%");
	}
	
	public void interest(int rate1,int rate2)
	{
		System.out.println("Axis Bank interest rate = " + rate1 + " and " + rate2);
	}
	
	
}
