package Day5.setExamples;
import java.util.*;

//set of numbers

public class Example1 
{
	public static void main(String[] args) {
		
		Set<Integer> setOfIds = new HashSet<Integer>();
		
		setOfIds.add(3124);
		setOfIds.add(3415);
		setOfIds.add(7628);
		setOfIds.add(9087);
		
		System.out.println(setOfIds); 
		
		for(int x : setOfIds)
		{
			System.out.println(x);
		}
	}
}
