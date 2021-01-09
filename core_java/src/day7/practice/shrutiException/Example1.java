package day7.practice.shrutiException;

import java.util.*;

public class Example1 {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter choice");
			int ch = sc.nextInt();
			
			int a=5;
			int b=0;
			int[] arr = {1,2,3,4};
			
			switch(ch)
			{
				case 1: 
						System.out.println("hello");
						System.out.print("Hello" + " " + 1 / 0);
						//int c = a/b;
						//System.out.println(c);
						System.out.println("hello");
						break;
				case 2: int i = arr[10];
						System.out.println(arr);
						break;
				default: System.out.println("Wrong choice");
			}
		}
		/*catch(Exception e)
		{
			System.out.println("In top parent");
		}*/
		catch(ArithmeticException e)
		{
			System.out.println("Arithemetic Exception occured");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occured");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("In parent catch");
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("In finally block");
		}

	}

}
