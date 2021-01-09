package Day1.Practice;

public class TimeTable 
{

	public static void main(String[] args) 
	{
		String ch = "Saturday";
		
		if(ch.equals("Monday") || ch.equals("Thrusday"))
		{
			System.out.println("Todays subject : Maths, English, History");
		}
		else if(ch.equals("Tuesday") || ch.equals("Friday"))
		{
			System.out.println("Todays subject : Chemistry, Hindi, Economics");
		}
		else if(ch == "Wednesday")
		{
			System.out.println("Todays subject : Java, Maths, Economics");
		}
		else if(ch == "Saturday" || ch == "Sunday")
		{
			System.out.println("Holiday :)");
		}

	}

}
