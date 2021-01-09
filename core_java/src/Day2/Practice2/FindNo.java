package Day2.Practice2;
/**
*
* Write a Java program to check if a given element exists in the array or not,
* int[] salaries = {20000, 25000, 55000, 47000, 38000};
* int salaryToFind = 55000;
*
*/
public class FindNo {

	public static void main(String[] args) 
	{
		int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
		int salaryToFind = 55000;
		int flag=0;
		
		for(int i=0;i<salaries.length;i++)
		{
			if(salaries[i]==salaryToFind)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("Found....");
		}
		else
			System.out.println("Not Found....");

	}

}
