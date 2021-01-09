package Day5.linkedlist;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
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
