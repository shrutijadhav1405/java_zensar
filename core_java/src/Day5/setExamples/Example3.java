package Day5.setExamples;
import java.util.*;

public class Example3 
{
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		
		names.add("India");
		names.add("Japan");
		names.add("China");
		names.add("Paris");
		
		for(String x : names)
		{
			System.out.println(x);
		}
	}
}
