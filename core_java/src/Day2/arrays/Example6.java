package Day2.arrays;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = {{55,3,40},{11,44,22}};
		//System.out.println(myNumbers[0]);
		//System.out.println(myNumbers[0]);
		
		int[] firstArray = myNumbers[0];
		int[] secondArray = myNumbers[1];
		
		for(int i=0;i<firstArray.length;i++)
		{
			System.out.println(firstArray[i]);
		}
		
		System.out.println("*************");
		
		for(int i=0;i<firstArray.length;i++)
		{
			System.out.println(secondArray[i]);
		}
		
		System.out.println("*************");
		
		System.out.println(myNumbers[1][2]);
		
	
	
	}

}
