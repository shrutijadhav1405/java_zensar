package Day5.setExamples;
import java.util.*;

public class Example4 
{
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
		
		names.add("India");
		names.add("Japan");
		names.add("China");
		names.add("Paris");
		
		Iterator<String> iter = names.iterator();
		
		while(iter.hasNext())
		{
			String x = iter.next();
			System.out.println(x);
		}
	}
}
