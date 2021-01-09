package Day5.hashmapExamples;
import java.util.*;
public class Example4 {
	public static void main(String[] args) {
		
		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
		
		mapOfStatesAndCities.put("pune", "maharashtra");
		mapOfStatesAndCities.put("gandhinagar", "gujarat");
		mapOfStatesAndCities.put("nagpur", "maharashtra");
		mapOfStatesAndCities.put("hyderabad", "telangana");
		
		//System.out.println(mapOfStatesAndCities);
		Set<String> states = mapOfStatesAndCities.keySet();
		
		Iterator<String> iter = states.iterator();
		
		while(iter.hasNext())
		{
			String key = iter.next();
			String s = mapOfStatesAndCities.get(key);
			System.out.println(s);
		}
		
	}

}
