package Day3.shrutiScanner;
import java.util.*;

public class CourseInquiry 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int id;
		String name;
		String course;
		
		//Take input
		System.out.println("*****Welcome to courseInquiry******");
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter id: ");
		id = sc.nextInt();
		//sc.nextLine();
		
		System.out.println("Enter course: ");
		course = sc.next();
		//sc.nextLine();
		
		if(course.equalsIgnoreCase("java"))
		{
			System.out.println("Hello "+name+" course "+course+" will start from 23.12.2020");
		}
		else if(course.equalsIgnoreCase("c"))
		{
			System.out.println("Hello "+name+" course "+course+" will start from 2.01.2021");
		}
		else if(course.equalsIgnoreCase(".Net"))
		{
			System.out.println("Hello "+name+" course "+course+" will start from 27.12.2020");
		}
		else
		{
			System.out.println("Course not arranged yet.....");
		}
		
		sc.close();

	}

}
