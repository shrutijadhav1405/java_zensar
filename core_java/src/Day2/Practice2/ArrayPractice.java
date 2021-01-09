package Day2.Practice2;
/**
*
* Write a Java program to find sum of values of a given array.
*
*/


public class ArrayPractice 
{
	public static void main(String[] args) 
	{
		int[] marks = {69, 85, 66, 80, 81 };
		int sum = 0;
		int avg = 0;
		for(int i=0;i<marks.length;i++)
		{
			sum = sum + marks[i];
			
			
		}
		avg = sum/marks.length;
		
		
		System.out.println(sum);
		System.out.println(avg);
		


		 }

}
