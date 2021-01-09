package Day3.classAttribute;

import Day3.beans.Timetable;

public class TestTimetable {

	public static void main(String[] args) 
	{
		Timetable t1 = new Timetable("Monday Wednesday","Java",101);
		Timetable t2 = new Timetable("Tuesday Thrusday",".Net",202);
		Timetable t3 = new Timetable("Wednesday","C",303);
		Timetable t4 = new Timetable("Saturday Sunday","Python",404);
		
		Timetable[] time = {t1, t2, t3, t4};
		
		TestTimetable tt = new TestTimetable();
		tt.displayTimetable(time);
		

	}
	
	public void displayTimetable(Timetable[] table)
	{
		for(Timetable t : table)
		{
			System.out.println(t);
		}
	}

}
