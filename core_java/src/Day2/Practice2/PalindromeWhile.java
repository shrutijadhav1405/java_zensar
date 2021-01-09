package Day2.Practice2;

public class PalindromeWhile {

	public static void main(String[] args) 
	{
		int r;
		int sum=0;
		int temp;
		
		int n = 454;
		temp = n;
		
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		
		if(temp==sum)
			System.out.println("Palindrome..");
		else
			System.out.println("Not Palindrome..");

	}

}
