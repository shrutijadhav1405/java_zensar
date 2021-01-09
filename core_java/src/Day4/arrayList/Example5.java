package Day4.arrayList;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		
		salariesList.add(25000);
		salariesList.add(26000);
		salariesList.add(20000);
		salariesList.add(30000);
		
		for(int x:salariesList)
		{
			System.out.println(x);
		}

	}

}
