package Day4.arrayList;

import java.util.*;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		ArrayList<String> cities = new ArrayList<String>();
		
		String city;
		
		System.out.println("Enter the no of iterations");
		int choice = sc1.nextInt();
		
		for(int i=0;i<choice;i++)
		{
			System.out.println("Enter city "+ i);
			
			city = sc2.nextLine();
			cities.add(city);
		}
		
		System.out.println(cities);

	}

}
