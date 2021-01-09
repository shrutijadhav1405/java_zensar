package Day4.arrayList.arrayListOfBeans;

import java.util.ArrayList;

import Day3.classAttribute.Employee;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(1001, "Robin");
		Employee employee2 = new Employee(1002, "Joy");
		Employee employee3 = new Employee(2011, "Riya");
		Employee employee4 = new Employee(3001, "Uma");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
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
