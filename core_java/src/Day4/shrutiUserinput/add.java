package Day4.shrutiUserinput;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		//Scanner sc3 = new Scanner(System.in);
		
		//System.out.println("Enter ::");
		//boolean boo = sc3.nextBoolean();
		//System.out.println("next " + sc3.hasNextBoolean());
		
		System.out.println("Enter choice: ");
		int ch = sc1.nextInt();
		
		switch(ch)
		{
		case 1:	
				System.out.println("Enter no1");
				int a = sc2.nextInt();
				System.out.println("Enter no2");
				int b = sc2.nextInt();
				addInt(a,b);
				break;
		case 2:	
				System.out.println("Enter no1");
				double a1 = sc2.nextDouble();
				System.out.println("Enter no2");
				double b1 = sc2.nextDouble();
				addDouble(a1,b1);
				break;
		case 3:	
				System.out.println("Enter string1");
				String s1 = sc2.nextLine();
				System.out.println("Enter string2");
				String s2 = sc2.nextLine();
				addString(s1,s2);
				break;
				default: System.out.println("Wrong Choice");
				
				
		}

	}
	
	public static void addInt(int a, int b)
	{
		int sum = a+b;
		System.out.println("Addition of integer = " + sum);
	}
	
	public static void addDouble(double a, double b)
	{
		double sum = a+b;
		System.out.println("Substraction of double = " + sum);
	}

	public static void addString(String fname, String lname)
	{
		String name = fname.concat(lname);
		System.out.println("Addition of string = " + name);
	}
}
