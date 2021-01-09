package Day5.hashmapExamples;
import java.util.*;
public class Example2 {
	public static void main(String[] args) {
		
		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();
		
		mapOfStatesAndCities.put("pune", "maharashtra");
		mapOfStatesAndCities.put("gandhinagar", "gujarat");
		mapOfStatesAndCities.put("nagpur", "maharashtra");
		mapOfStatesAndCities.put("hyderabad", "telangana");
		
		//System.out.println(mapOfStatesAndCities);
		Set<String> states = mapOfStatesAndCities.keySet();
		
		for(String x : states)
		{
			String s = mapOfStatesAndCities.get(x);
			System.out.println(s);
		}
		
	}

}
