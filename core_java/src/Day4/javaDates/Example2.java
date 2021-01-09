package Day4.javaDates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);

	}

}
