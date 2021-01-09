package sat1.bean4;

import java.util.*;

public class TestBookInfo 
{
	public static void main(String[] args)
	{
		BookInfo b1 = new BookInfo("Book1",200,1000);
		BookInfo b2 = new BookInfo("Book2",1000,250);
		BookInfo b3 = new BookInfo("Book3",50,100);
		BookInfo b4 = new BookInfo("Book4",200,1000);
		
		Set<BookInfo> books = new HashSet<BookInfo>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		for(BookInfo x : books)
		{
			System.out.println(x);
		}
		
	}
}
