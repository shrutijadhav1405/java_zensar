package Day5.hashmapExamples;

import java.util.*;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import Day3.classAttribute.Employee;

public class ExampleBeans2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1001, "Robin");
		Employee employee2 = new Employee(1002, "Joy");
		Employee employee3 = new Employee(2011, "Riya");
		Employee employee4 = new Employee(3001, "Uma");
		
		//Set<Employee> employeeList = new HashSet<Employee>();
		Map<Integer, Employee> employeeList = new HashMap<Integer, Employee>();
		
		employeeList.put(101,employee1);
		employeeList.put(202,employee2);
		employeeList.put(303,employee3);
		employeeList.put(404,employee4);
		
		//System.out.println(employeeList);
		
		Set<Integer> eid = employeeList.keySet();
		
		Iterator<Integer> iter = eid.iterator();
		
		System.out.println("\nUsing Iterator...........\n");
		
		while(iter.hasNext())
		{
			int x = iter.next();
			Employee emp = employeeList.get(x);
			System.out.println(x + " " + emp);
		}
		
		System.out.println("\nUsing for-each...........\n");
		
		for(int i : eid)
		{
			int id = i;
			Employee e = employeeList.get(id);
			System.out.println(i + " " +e);
		}
		
	}	

}
