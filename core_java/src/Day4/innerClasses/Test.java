package Day4.innerClasses;

import Day4.innerClasses.OuterClass.InnerClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass outerClass = new OuterClass();
		System.out.println(outerClass.x);
		InnerClass innerClass = outerClass.new InnerClass();
		System.out.println(innerClass.y);
	}

}
