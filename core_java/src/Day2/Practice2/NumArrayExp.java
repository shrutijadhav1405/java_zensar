package Day2.Practice2;

public class NumArrayExp {

	public static void main(String[] args) 
	{
		int[] age = {12,19,20,49,65,9};
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Age is "+ age[i]);
			
			if(age[i]<18)
			{
				System.out.println("Can't Vote....");
			}
			else
			{
				System.out.println("Can Vote....");
			}
		}

	}

}
