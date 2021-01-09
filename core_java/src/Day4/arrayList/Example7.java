package Day4.arrayList;

import java.util.*;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> salariesList = new ArrayList<Integer>();
		
		salariesList.add(25000);
		salariesList.add(26000);
		salariesList.add(20000);
		salariesList.add(30000);
		
		Collections.sort(salariesList);
		
		
		for(int x:salariesList)
		{
			System.out.println(x);
		}
		
		System.out.println("Reverse......");
		
       //Collections.reverse(salariesList);
		Collections.sort(salariesList, Collections.reverseOrder());
		
		for(int x:salariesList)
		{
			System.out.println(x);
		}

	}

}
