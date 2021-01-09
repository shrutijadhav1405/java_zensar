package sat1.bean5;

import java.util.*;

public class TestAccount 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(145628,"Meghan");
		Account a2 = new Account(967523,"Williams");
		Account a3 = new Account(984521,"Harry");
		Account a4 = new Account(980472,"Kate");
		
		Set<Account> accDetails = new HashSet<Account>();
		
		accDetails.add(a1);
		accDetails.add(a2);
		accDetails.add(a3);
		accDetails.add(a4);
		
		Iterator<Account> iter = accDetails.iterator();
		
		while(iter.hasNext())
		{
			Account x = iter.next();
			System.out.println(x);
		}
	}
}
