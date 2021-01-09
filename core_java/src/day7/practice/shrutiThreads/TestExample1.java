package day7.practice.shrutiThreads;

import day7.threads.Example2;

public class TestExample1 {

	public static void main(String[] args) {
		
		Example1 e1 = new Example1();
		Example1 e2 = new Example1();
		
		e1.start();
		e2.start();
		
		
		/*
		Example1 e11 = new Example1();
		Thread thread1 = new Thread(e11);
		thread1.start();
		
		Example1 e22 = new Example1();
		Thread thread2 = new Thread(e22);
		thread2.start();
		*/
	}

}
