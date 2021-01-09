package Day4.shrutiAbstraction;

public class Test {

	public static void main(String[] args)
	{
		Details d1 = new Bill(101,"Joy");
		System.out.println(d1);
		d1.amount(1000);
		
		System.out.println("*****************************");
		
		Details d2 = new Bill(101,"Joy");
		System.out.println(d2);
		d2.amount(2500);

	}

}
