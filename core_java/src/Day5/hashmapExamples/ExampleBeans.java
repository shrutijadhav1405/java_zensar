package Day5.hashmapExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Day3.classAttribute.Employee;

public class ExampleBeans {
	
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
		
		for(Integer x:eid)
		{
			int id = x;
			Employee e = employeeList.get(id);
			System.out.println(e);
		}
	}	

}
