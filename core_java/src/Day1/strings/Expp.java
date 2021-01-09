package Day1.strings;

public class Expp {

	public static void main(String[] args) 
	{
		char c1 = '1';
       // int i = (int) c1;
        //System.out.println(c1+"  "+i);
        
        int i = Character.getNumericValue(c1);
        System.out.println(c1+" "+i);
        
        //new
        
        char c3 = '2';
        int j = c3;
        System.out.println(c3+"  "+j);
        
        
        double value = 22.2;
        char c2 = (char) value;
        System.out.println(value);
        System.out.println(c2);
        System.out.println(value+"  "+c2);
        String str = Double.toString(c2);
        System.out.println(str);


	}

}
