package Day5.setExamples;

import java.util.*;

import Day3.classAttribute.Employee;

public class Example5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1001, "Robin");
		Employee employee2 = new Employee(1002, "Joy");
		Employee employee3 = new Employee(2011, "Riya");
		Employee employee4 = new Employee(3001, "Uma");
		
		Set<Employee> employeeList = new HashSet<Employee>();
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		//System.out.println(employeeList);
		
		for(Employee x:employeeList)
		{
			System.out.println(x);
		}
	}	

}
