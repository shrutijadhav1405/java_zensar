package sat1.bean6;

import java.util.*;

public class TestCricketer 
{
	public static void main(String[] args) {
		
	
	Cricketer c1 = new Cricketer(18, "Virat");
	Cricketer c2 = new Cricketer(99, "Ashwin");
	Cricketer c3 = new Cricketer(7, "Dhoni");
	Cricketer c4 = new Cricketer(3, "Ajinkya");
	
	Map<Integer, Cricketer> info = new HashMap<Integer, Cricketer>();
	
	info.put(11, c1);
	info.put(88, c2);
	info.put(77, c3);
	info.put(22, c4);
	
	Set<Integer> no = info.keySet();
	
	for(Integer x : no)
	{
		int i = x;
		Cricketer values = info.get(i);
		System.out.println(i + " " + values);
	}
	
	
	}	
	
}
