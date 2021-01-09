package Day4.arrayList;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyndai");
		
		for(String x:cars)
		{
			System.out.println(x);
		}
	}

}
