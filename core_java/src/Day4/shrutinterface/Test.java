package Day4.shrutinterface;

public class Test {

	public static void main(String[] args) 
	{
		Formulas f1 = new Square();
		Formulas f2 = new Circle();
		
		System.out.println("********SQUARE**********");
		f1.displayArea(1);
		f1.displayPerimeter(1);
		
		System.out.println("\n********CIRCLE**********");
		f2.displayArea(1);
		f2.displayPerimeter(1);

	}

}
