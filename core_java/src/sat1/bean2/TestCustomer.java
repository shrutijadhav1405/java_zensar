package sat1.bean2;
import java.util.*;

public class TestCustomer 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(2989,"Robin");
		Customer c2 = new Customer(2543,"Joy");
		Customer c3 = new Customer(6543,"Jay");
		Customer c4 = new Customer(4521,"Riya");
		
		List<Customer> cust = new ArrayList<Customer>();
		
		cust.add(c1);
		cust.add(c2);
		cust.add(c3);
		cust.add(c4);
		
		for(Customer x : cust)
		{
			System.out.println(x);
		}
	}
}
