package Day2.methods;

public class Example6 
{
	// method with array as parameter
	
	public void displayNamesArray(String[] names) 
	{
		for(String x: names)
		{
			System.out.println(x);
		}
	}
	
	public String[] getArrayOfNames()
	{
		String[] names = {"John", "David", "Patrick"};
		return names;
		
	}
}
