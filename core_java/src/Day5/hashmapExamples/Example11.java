package Day5.hashmapExamples;
import java.io.ObjectOutputStream.PutField;
import java.util.*;

public class Example11 
{
	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("Joy", 78);
		marks.put("Robin", 88);
		marks.put("Uma", 65);
		marks.put("Riya", 99);
		marks.put("Kiya", 78);
		
		System.out.println(marks);
		
		//Double & Int
		
		Map<Integer, Double> bill = new HashMap<Integer, Double>();
		
		bill.put(101, 250.90);
		
		System.out.println(bill);
		
		//Int & Boolean
		
		Map<Integer, Boolean> attendence = new HashMap<Integer, Boolean>();
		
		attendence.put(11, false);
		attendence.put(14, true);
		
		System.out.println(attendence);
		
		
	}
	
	
	
	
}
