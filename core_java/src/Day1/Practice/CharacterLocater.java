package Day1.Practice;

public class CharacterLocater {

	public static void main(String[] args)
	{
		String str = "h";
		String txt = "Hello how are you ??";
		
		int ans = txt.indexOf(str);
		
		System.out.println("The character "+ str + " is located at index " + ans);
		

	}

}
