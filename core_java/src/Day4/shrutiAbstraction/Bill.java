package Day4.shrutiAbstraction;

public class Bill extends Details
{

	public Bill(int id,String nm)
	{
		super(id,nm);
		System.out.println("In Bill constructor");
	}
	
	@Override
	public void amount(int amt) 
	{
		System.out.println("Bill Amount = " + amt);
		
	}
	
}
