package Day3.shrutiInheritance1;

import Day3.shrutiInheritance.A;

public class D extends A
{
	public void printD()
	{
		System.out.println("In D");
	}
	
	public static void main(String[] args) {
		D d1 = new D();
		d1.printA();
	}

}
