package Day1.Practice;

public class SwitchMath 
{

	public static void main(String[] args) 
	{
		System.out.println("Choices 1.Max 2.Min 3.Square Root 4.Random 5.Power of 2");
		
		int a = 10;
		int b = 25;
		
		int ch = 6;
		
		switch(ch)
		{
		case 1: 
			int result1 = Math.max(a, b);
			System.out.println(result1);
			break;
		case 2:
			int result2 = Math.min(a, b);
			System.out.println(result2);
			break;
		case 3:
			double result3 = Math.sqrt(b);
			System.out.println(result3);
			break;
		case 4:
			double result5 = Math.random();
			System.out.println(result5);
			break;
		case 5:
			double ress = Math.pow(a, 2);
			System.out.println(ress);
			break;
		case 6:
			double result4 = Math.abs(-4.77);
			System.out.println(result4);
			break;
		}
		

	}

}
