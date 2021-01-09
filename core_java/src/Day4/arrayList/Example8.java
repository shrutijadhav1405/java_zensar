package Day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyndai");
		
		Collections.sort(cars);
		
		for(String x:cars)
		{
			System.out.println(x);
		}
		
		System.out.println("Reverse.......");
		
		Collections.sort(cars, Collections.reverseOrder());
		
		for(String x:cars)
		{
			System.out.println(x);
		}
	}

}
