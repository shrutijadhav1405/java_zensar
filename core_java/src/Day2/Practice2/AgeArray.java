package Day2.Practice2;

public class AgeArray 
{

	public static void main(String[] args) 
	{
		int[] age = {12,19,65,9};
		String[] names = {"John", "Riya", "David", "Patrick"};
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Age is "+ age[i]);
			System.out.println("Name is "+ names[i]);
			
			if(age[i]<18)
			{
				System.out.println(names[i] + " Your age is " + age[i] + " You Can't Vote....");
				System.out.println("***********************************");
			}
			else
			{
				System.out.println(names[i] + " Your age is " + age[i] + " You Can Vote....");
				System.out.println("***********************************");
			}
		}

	}

}
