package Day2.arrays;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {98,86,75};
		/*
		for(int i=0;i<marks.length;i++)
		{
			int x = marks[i];
			System.out.println(x);
		}
		*/
		
		for(int x:marks)
		{
			System.out.println(x);
		}
		
		System.out.println(++marks[1]);
		
		System.out.println(marks);
	}

}
