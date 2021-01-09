package day7.practice.shrutiFileHandling;
import java.util.*;
import java.io.*;

public class Example1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter choice"); 
		int ch = sc.nextInt();
		
		switch (ch) 
		{
			case 1: System.out.println("Create File\n");
			
					Scanner sc4 = new Scanner(System.in);
			
					System.out.println("Enter File Name\n");
					String fileName1 = sc4.nextLine();
					
					File file1 = new File(fileName1.concat(".txt"));
					try 
					{
						boolean res = file1.createNewFile();
				
						if(res)
						{
							System.out.println("File successfully created: "+file1.getName());
						}
						else
						{
							System.out.println("File already exists");
						}
				
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
			
					break;
					
			case 2: System.out.println("Write into file\n");
			
					Scanner sc5 = new Scanner(System.in);
			
					System.out.println("Enter File Name\n");
					String fileName2 = sc5.nextLine();
			
					try 
					{
						FileWriter writer = new FileWriter(fileName2.concat(".txt"));
						writer.write("Hello\n");
						writer.write("How are you\n");
						writer.write("Welcome\n");
						writer.close();
						
						System.out.println("Successfully written");
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					
					break;
				
			case 3: System.out.println("Read File\n");
			
					Scanner sc3 = new Scanner(System.in);
			
					System.out.println("Enter File Name\n");
					String fileName3 = sc3.nextLine();
			
					File file3 = new File(fileName3.concat(".txt"));
					
					try 
					{
						Scanner sc1 = new Scanner(file3);
						
						while(sc1.hasNext())
						{
							String x = sc1.nextLine();
							System.out.println(x);
						}
					} 
					catch (FileNotFoundException e) 
					{
						e.printStackTrace();
					}
					break;
					
			case 4: System.out.println("Deleting File");
			
					Scanner sc2 = new Scanner(System.in);
					
					System.out.println("Enter File Name\n");
					String fileName4 = sc2.nextLine();
					
					File file4 = new File(fileName4.concat(".txt"));
			
					boolean fileExits = file4.exists();
			
					if(fileExits)
					{
						System.out.println("File exists");
						System.out.println("Now going to delete");
				
						boolean result = file4.delete();
				
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
					
					break;
		case 5: 	System.out.println("Append String"); 
		
					Scanner sc6 = new Scanner(System.in);
		
					System.out.println("Enter File Name\n");
					String fileName5 = sc6.nextLine();
		
					String str = "buffer reader"; 
					
					BufferedWriter out;
					try 
					{
						out = new BufferedWriter (new FileWriter(fileName5.concat(".txt"), true));
						out.write("buffer reader\n");
						System.out.println("Inserted successfully");
						out.close(); 
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					} 
			       break;
					
					
			

			default: System.out.println("Wrong Choice");
			break;
		}

	}

}
