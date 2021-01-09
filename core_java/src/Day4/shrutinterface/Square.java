package Day4.shrutinterface;

public class Square implements Formulas
{

	@Override
	public void displayArea(double a) 
	{
		System.out.println("Square Area = side*side" );
		System.out.println("Area of Square = " + a*a);
		
	}

	@Override
	public void displayPerimeter(double a) 
	{
		System.out.println("Square Perimeter = 4*side" );
		System.out.println("Perimeter of Square = " + 4*a);
		
	}

}
