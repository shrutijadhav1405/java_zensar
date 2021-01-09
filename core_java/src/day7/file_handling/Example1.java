package day7.file_handling;
import java.io.*;

public class Example1 {

	public static void main(String[] args) {
		
		try
		{
			File file = new File("courses.txt");
			//File file = new File("D:\\courses.txt");
			
			boolean result = file.createNewFile();
			
			if(result)
			{
				System.out.println("File successfully created: "+file.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
	}
}
