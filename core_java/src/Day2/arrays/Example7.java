package Day2.arrays;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		    for (int i = 0; i < myNumbers.length; ++i) 
		    {
		    	int[] innerArray = myNumbers[i];
		    	
		      for(int j = 0; j < innerArray.length; ++j) 
		      {
		        System.out.println(myNumbers[i][j]);
		      }
		    }
		    
		    System.out.println(myNumbers.length);
		    System.out.println();

	}

}
