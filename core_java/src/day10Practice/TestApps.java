package day10Practice;

class TestApps {
    
	/*
	int i[] = { 0 };

    public static void main(String args[]) {
        int i[] = { 1 };
        alter(i);
        System.out.println(i[0]);
    }

    public static void alter(int i[]) {
        int j[] = { 2 };
        i = j;
    }
    */
	
	String args[] = { "1", "2" };

    public static void main(String args[]) 
    {
    	String arg[] = { "1", "2" };
    	
        if (args.length > 0)
            System.out.println(args.length);
        System.out.println(arg.length);
        System.out.println(args.length);
    }
}