package day7.practice.shrutiThreads;

public class Example1 extends Thread implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println(i);
			
		}
		
		System.out.println("Id: " + Thread.currentThread().getId() + "\n");
	}
}
