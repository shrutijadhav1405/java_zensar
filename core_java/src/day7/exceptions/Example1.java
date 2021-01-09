package day7.exceptions;

public class Example1 
{
	public static void main(String[ ] args) 
	{
	    try 
	    {
	      int[] myNumbers = {1, 2, 3};
	      //System.out.println(myNumbers[10]);
	      System.out.println(myNumbers[1]);
	      
	    } 
	    
	    catch (Exception e)
	    {
	      System.out.println("Something went wrong.");
	      //System.out.println(e);
	    }
	    finally
	    {
	    	System.out.println("This is finally block");
	    }
	    
	  }
}
