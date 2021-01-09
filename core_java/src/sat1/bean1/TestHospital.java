package sat1.bean1;

import java.util.*;

public class TestHospital {

	public static void main(String[] args) 
	{
		Hospital h1 = new Hospital(101, "Joy", 1000);
		Hospital h2 = new Hospital(303, "James", 500);
		Hospital h3 = new Hospital(202, "Ruhi", 250);
		Hospital h4 = new Hospital(404, "Uma", 100);
		
		ArrayList<Hospital> hosplist = new ArrayList<Hospital>();
		
		hosplist.add(h1);
		hosplist.add(h2);
		hosplist.add(h3);
		hosplist.add(h4);
		
		for(int i=0;i<hosplist.size();i++)
		{
			System.out.println(hosplist.get(i));
		}

	}

}
