package sat1.bean3;

import java.util.*;

public class TestInvitationCard 
{
	public static void main(String[] args) 
	{
		InvitationCard i1 = new InvitationCard("Jadhav Family", 5);
		InvitationCard i2 = new InvitationCard("Sharma Family", 7);
		InvitationCard i3 = new InvitationCard("Bhosale Family", 10);
		InvitationCard i4 = new InvitationCard("Gupta Family", 2);
		
		List<InvitationCard> invites = new ArrayList<InvitationCard>();
		
		invites.add(i1);
		invites.add(i2);
		invites.add(i3);
		invites.add(i4);
		
		Iterator<InvitationCard> iter = invites.iterator();
		
		while(iter.hasNext())
		{
			InvitationCard x = iter.next();
			System.out.println(x);
		}
	}
}
