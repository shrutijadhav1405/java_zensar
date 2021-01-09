package Day1.Practice;

public class AllocString {

	public static void main(String[] args) 
	{
		String s = new String("abc");
		
		String s1 = new String("abc");
		
		String s2 = "abc";
		
		String s3 = "bcd";
		
		String s4 = "abc";
		
		/*
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s2));
		
		System.out.println(s2==s3);
		
		System.out.println(s2.equals(s3));
		
		System.out.println(s2==s4);
		
		System.out.println(s2.equals(s4));
		*/
		String name1 = "Shruti";
		String name2 = "SHRUTI";
		
		System.out.println(name1.equals(name2));
		
		System.out.println(name1.equalsIgnoreCase(name2));

	}

}
