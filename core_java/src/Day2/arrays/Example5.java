package Day2.arrays;

public class Example5 {

	public static void main(String[] args) 
	{
		// update existing values of an array
		
		String[] cars = {"BMW", "Volvo", "Honda", "Hyundai"};
		
		cars[0] = "Audi";
		cars[2] = "Nano";
		
		for(String x:cars) 
		{
		System.out.println(x);
		}

	}

}
