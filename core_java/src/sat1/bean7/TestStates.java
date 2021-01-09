package sat1.bean7;

import java.util.*;

public class TestStates 
{
	public static void main(String[] args) 
	{
		States s1 = new States(41140, "Pune");
		States s2 = new States(91190, "Cario");
		States s3 = new States(81180, "Atlanta");
		States s4 = new States(71107, "Tokyo");
		
		Map<String, States> info = new HashMap<String, States>();
		
		info.put("India", s1);
		info.put("Egypt", s2);
		info.put("US", s3);
		info.put("Japan", s4);
		
		Set<String> id = info.keySet();
		
		Iterator<String> iter = id.iterator();
		
		while(iter.hasNext())
		{
			String i = iter.next();
			States x = info.get(i);
			System.out.println(i + " " + x);
		}
	}
	
	
}
