package Day4.arrayList;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyndai");
		
		for(int i=0;i<cars.size();i++)
		{
			String x = cars.get(i);
			System.out.println(x);
		}
	}

}
