package Day4.shrutinterface;

public class Circle implements Formulas
{

	@Override
	public void displayArea(double a) 
	{
		System.out.println("Circle area = pie*radius*radius");
		System.out.println("Area of circle = " + 3.14*a*a);
		
	}

	@Override
	public void displayPerimeter(double a) 
	{
		System.out.println("Circle perimeter = 2*pie*radius");
		System.out.println("Perimeter of circle = " + 2*3.14*a);
		
	}

}
