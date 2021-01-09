package Day5.arrayList;

import java.util.ArrayList;

public class ExpString {

	public static void main(String[] args)
	{
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("Pink");
		color.add("Blue");
		color.add("Black");
		color.add("White");
		
		for(String x : color)
		{
			System.out.println("Color is " + x);
		}

	}

}
