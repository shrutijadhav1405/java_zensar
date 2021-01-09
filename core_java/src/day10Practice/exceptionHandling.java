package day10Practice;

public class exceptionHandling 
{
	public static void main(String args[]) 
    {
		int sum =99;
        try 
        {
            int i;
            sum = 10;
            for (i = -1; i < 3 ;++i)
                sum = (sum / i);
            System.out.println(sum);
        }
        catch(ArithmeticException e) 
        {
        	System.out.print("0");  
        	
        } 
        
        System.out.print(sum);
        //System.out.println(i);
    }
}
