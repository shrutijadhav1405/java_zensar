package Day3.shrutiPolymorphism;

public class TestBank 
{

	public static void main(String[] args) 
	{
		
		Bank b = new Bank();
		b.interestRate();
		
		Axis a = new Axis();
		a.interestRate();
		
		Axis a1 = new Axis();
		a1.interest(5);
		a1.interest(2, 5);
		
		Idfc i = new Idfc();
		i.interestRate();
		
		Idfc i1 = new Idfc();
		i.interest(4);
		
		
	}

}
