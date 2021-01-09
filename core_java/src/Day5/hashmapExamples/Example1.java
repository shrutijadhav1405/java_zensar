package Day5.hashmapExamples;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mapOfCities = new HashMap<Integer, String>();
		
		mapOfCities.put(23, "Pune");
		mapOfCities.put(13, "Mumbai");
		mapOfCities.put(83, "Sydney");
		mapOfCities.put(55, "Melbourne");
		
		System.out.println(mapOfCities);
		
		Set<Integer> keysSet = mapOfCities.keySet();
		
		for(int x : keysSet)
		{
			String city = mapOfCities.get(x);
			System.out.println(x + " " + city);
		}
		
	}

}
