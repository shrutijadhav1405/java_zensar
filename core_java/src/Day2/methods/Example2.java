package Day2.methods;

public class Example2 
{
	
	
		public static void add(int x,int y)
	{
		//int x = 4;
		//int y = 5;
		int z = x+y;
		System.out.println(z);
	}
		
		public static void sub(int x,int y)
		{
			//int x = 14;
			//int y = 8;
			int z = x-y;
			System.out.println(z);
		}
		
		public static void mul()
		{
			int x = 4;
			int y = 5;
			int z = x*y;
			System.out.println(z);
		}
		
		public static void div()
		{
			int x = 20;
			int y = 5;
			int z = x/y;
			System.out.println(z);
		}
		
		public static void modd()
		{
			int x = 21;
			int y = 5;
			int z = x%y;
			System.out.println(z);
		}
		
	
		public static void main(String[] args) 
		{
			add(4,5);
			sub(14,8);
			mul();
			div();
			modd();
			
			
		}
	

}
