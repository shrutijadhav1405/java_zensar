package Day5.arrayList;

import java.util.*;

public class ExpInteger {

	public static void main(String[] args) 
	{
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(77);
		marks.add(65);
		marks.add(89);
		marks.add(50);
		
		for(int i=0;i<marks.size();i++)
		{
			System.out.println("Marks = " + marks.get(i));
		}

	}

}
