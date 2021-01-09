package Day5.hashmapExamples;

import java.util.*;
//using iterator

public class Example3 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> mapOfCities = new HashMap<Integer, String>();
		
		mapOfCities.put(23, "Pune");
		mapOfCities.put(13, "Mumbai");
		mapOfCities.put(83, "Sydney");
		mapOfCities.put(55, "Melbourne");
		
		//System.out.println(mapOfCities);
		
		Set<Integer> keysSet = mapOfCities.keySet();
		
		Iterator<Integer> iter = keysSet.iterator();
		
		while(iter.hasNext())
		{
			int key = iter.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
	}

}
