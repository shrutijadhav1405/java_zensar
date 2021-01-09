package Day2.methods;

public class TestExample6 {

	public static void main(String[] args) 
	{

		Example6 example6 = new Example6();
		
		//String[] names = {"John", "David", "Patrick"};
		
		//example6.displayNamesArray(names);
		
		String[] names = example6.getArrayOfNames();
		example6.displayNamesArray(names);
	}

}
