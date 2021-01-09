package Day3.scannerExample;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = sc.nextLine();
		
		System.out.println("Enter age ");
		int age = sc.nextInt();
		
		//System.out.println("Enter age ");
		//int marks[] = new int[4];
		
		
		
		System.out.println("UserName " + name);
		System.out.println("Age " + age);
		
		sc.close();
		
		
	}

}
