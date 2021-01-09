package Day3.classAttribute;

import Day3.beans.Restaurant;
//import Day3.beans.Student;

public class TestRestaurant {

	public static void main(String[] args) 
	{
		Restaurant r1 = new Restaurant(101, "Robin", 1000);
		Restaurant r2 = new Restaurant(201, "Jack", 2500);
		Restaurant r3 = new Restaurant(321, "Joe", 3000);
		
		Restaurant[] rest = {r1, r2, r3};
		
		TestRestaurant tr = new TestRestaurant();
		tr.displayRest(rest);
		

	}
	
	public void displayRest(Restaurant[] restt)
	{
		for(Restaurant s:restt) 
		{
			System.out.println(s);
		}
	}

}
