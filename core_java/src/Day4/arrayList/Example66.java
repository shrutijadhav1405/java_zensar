package Day4.arrayList;

import java.util.*;

public class Example66 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		ArrayList<String> cities = new ArrayList<String>();
		
		String city;
		
		//System.out.println("Enter the no of iterations");
		//int choice = sc1.nextInt();
		
		while(true)
		{
			System.out.println("Do you want to enter city name....(y/n)");
			String ch = sc1.nextLine();
			
			if(ch.equalsIgnoreCase("y"))
			{
				System.out.println("Enter city ");
				
				city = sc2.nextLine();
				cities.add(city);
			}
			else if(ch.equalsIgnoreCase("n"))
			{
				break;
			}
			else
			{
				System.out.println("Wrong Choice");
				break;
			}
		}
		
		System.out.println(cities);

	}

}
