package day7.file_handling;
import java.io.*;

public class Example2 
{
	public static void main(String[] args) {
		
		try
		{
			FileWriter myWriter = new FileWriter("courses.txt");
			myWriter.write("Core Java\n");
			myWriter.write("Python\n");
			myWriter.write("Advance Java\n");
			//myWriter.append('A');
			myWriter.close();
			System.out.println("Successfully wrote");
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
