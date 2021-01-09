package Day5.setExamples;
import java.util.*;

//set of numbers

public class Example2 
{
	public static void main(String[] args) {
		
		Set<Integer> setOfIds = new HashSet<Integer>();
		
		setOfIds.add(3124);
		setOfIds.add(3415);
		setOfIds.add(7628);
		setOfIds.add(9087);
		
		//System.out.println(setOfIds); 
		
		Iterator<Integer> iter = setOfIds.iterator();
		
		while(iter.hasNext())
		{
			int x = iter.next();
			System.out.println(x);
		}
	}
}
