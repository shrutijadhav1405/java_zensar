package Day2.Practice2;

public class AreaMethodOverloading 
{

	public static int area(int l, int b)
	{
		int res;
		res = l*b;
		return res;
	}
	
	public static double area(double a)
	{
		double res;
		res = a*a;
		return res;
	}
	
	public static double area(double base, double height)
	{
		double res;
		res = 0.5*base*height;
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Choices 1.Area of Rectangle 2.Area of Square 3.Area of Triangle");
		int ch = 2;
		
		switch(ch)
		{
		case 1:
				System.out.println("Area of Rectangle is " + area(10,20));
				break;
		case 2:
				System.out.println("Area of Square is " + area(20));
				break;
		case 3:
				System.out.println("Area of Triangle is " + area(4,5));
				break;
		}
	}

}
