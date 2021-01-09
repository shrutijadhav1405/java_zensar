package Day5.arrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class TestBeans {

	public static void main(String[] args) {
		
		Orders r1 = new Orders(101, "Robin", 1000);
		Orders r2 = new Orders(201, "Jack", 2500);
		Orders r3 = new Orders(321, "Joe", 3000);
		
		ArrayList<Orders> rest = new ArrayList<Orders>();
		
		rest.add(r1);
		rest.add(r2);
		rest.add(r3);
		
		Iterator<Orders> iter = rest.iterator();
		while(iter.hasNext()) {
			Orders x = iter.next();
			System.out.println(x);
		}

	}

}
