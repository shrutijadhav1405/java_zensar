package day10Practice;

public class Example3 {

	public static void main(String[] args) 
	{
		/*
		String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "HELLO";
        System.out.println(s1.equals(s2) + " " + s2.equals(s3));
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        */
		/*
		String s = "Hello World";
		System.out.println("\""+s+"\"");	//because " \" " in this \" is a string so we 
											//need to include it in double quotes
											 * */

		StringBuffer sb=new StringBuffer("Hello");  
        sb.replace(1,3,"Java");  
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("shrutijadhav");  
        sb1.delete(3, 9);
        System.out.println(sb1);
	}

}
