package Day3.classAttribute;

import Day3.beans.*;

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(1, "Lisa", "Java");
		
		
		Student student2 = new Student(2, "Harry", "C++");
		
		
		Student student3 = new Student(3, "Joe", "C");
		
		
		Student student4 = new Student(1, "Robin", ".Net");
		
		Student[] arrayOfStudents = {student1, student2, student3, student4};
		
		TestStudent2 testStudent2 = new TestStudent2();
		testStudent2.displayAll(arrayOfStudents);
		
	}
		
		

	public void displayAll(Student[] stud)
	{
		for(Student s:stud) 
		{
			System.out.println(s);
		}
	}
	
}
