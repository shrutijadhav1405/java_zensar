package Day2.Practice2;

public class StringArrayExp {

	public static void main(String[] args) 
	{
		String[] days = {"Mon", "Tue", "Wed", "Thrus", "Fri", "Sat", "Sun"};
		/*
		for(int i=0;i<days.length;i++)
		{
			System.out.println("Day is "+ days[i]);
		}
		*/
		
		for(String d :days)
		{
			System.out.println("Day is "+ d);
		}

	}

}
