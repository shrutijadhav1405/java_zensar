package Day3.classAttribute;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Updating..");
		
		employee.setEmployeeId(6001);
		employee.setEmployeeName("John");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("Creating object using parameterized constructor");
		
		Employee employee2 = new Employee(1234, "Joe");
		
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		
		System.out.println("***************************");
		
		System.out.println(employee2);
		
	}

}
