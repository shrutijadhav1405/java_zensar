package Day4.arrayList;

import java.util.*;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyndai");
		
		Iterator<String> iter = cars.iterator();
		while(iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
		}
	}

}
