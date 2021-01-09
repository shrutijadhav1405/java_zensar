package day7.file_handling;

import java.io.*;

public class Example5 
{
	public static void main(String[] args) {
		
		File folder = new File("D:\\test1");
		folder.mkdir();
		
		boolean result = folder.exists();
		
		if(result)
		{
			System.out.println("Folder named test1 exits");
			System.out.println("Now we are going to delete it");
			folder.delete();
			System.out.println("Deleted successfully");
		}
		else
		{
			System.out.println("Folder named test1 does not exits");
		}
	}
}
