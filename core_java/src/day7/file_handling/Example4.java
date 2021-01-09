package day7.file_handling;
import java.io.*;

public class Example4 
{
	public static void main(String[] args) 
	{
		
		File file = new File("courses.txt");
		
		boolean fileExits = file.exists();
		
		if(fileExits)
		{
			System.out.println("File exists");
			System.out.println("Now going to delete");
			
			boolean result = file.delete();
			
			if(result)
			{
				System.out.println("File deleted");
			}
			else
			{
				System.out.println("File deletion failed");
			}
		}
		else
		{
			System.out.println("File dont exist");
		}
	}
}
