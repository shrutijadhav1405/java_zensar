package Day5.hashmapExamples;
import java.util.*;

public class Example22 {

	public static void main(String[] args) 
	{
		Map<String, String> vehicle = new HashMap<String, String>();
		
		vehicle.put("Type", "2-wheeler");
		vehicle.put("Price", "85000");
		vehicle.put("Name", "Suzuki");
		
		System.out.println(vehicle);
		
		System.out.println("Size = " + vehicle.size());
		
		System.out.println("key present " + vehicle.containsKey("Name"));
		
		System.out.println("Print value for the key " + vehicle.get("Price"));
		
		System.out.println("Hash code value is " + vehicle.hashCode());
		
		System.out.println("Keys = " + vehicle.keySet());
		
		System.out.println("Values = " + vehicle.values());
		
		

	}

}
