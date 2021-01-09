package Day5.linkedlist;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> salariesList = new LinkedList<Integer>();
		
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
