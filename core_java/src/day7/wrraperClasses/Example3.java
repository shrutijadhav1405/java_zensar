package day7.wrraperClasses;

public class Example3 {

	public static void main(String[] args) 
	{
		Integer myInt = 10;
		String myString = myInt.toString();
		System.out.println(myString);
		System.out.println(myInt);
		System.out.println(myString.length());
		
		Double d1 = myInt.doubleValue();
		System.out.println(d1);
		
		Double d2 = 10.99;
		Integer i1 = d2.intValue();
		System.out.println(i1);

	}

}
