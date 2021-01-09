package Day4.arrayList;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyndai");
		
		System.out.println(cars);
		
		//System.out.println(cars.get(3));
		
		System.out.println("Updating volvo to opel");
		cars.set(0, "Opel");
		System.out.println(cars);
		
		System.out.println("removing index2");
		cars.remove(2);
		System.out.println(cars);
		
		System.out.println("Removing all elements");
		cars.clear();
		System.out.println(cars);
		
		int s = cars.size();
		System.out.println(s);
	}

}
