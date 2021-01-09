package day10Practice;

public class Example2 
{
	int width;
    int length;
    int height;
    int volume;
    Example2() 
    {
    width = 5;
    length = 6;
    height = 1;
    }
    void volume() 
    {
         volume = width * height * length;
    } 
    
    public static void main(String args[]) 
    {
    	Example2 obj = new Example2();
        obj.volume();
        System.out.println(obj.volume);
    } 
}    

