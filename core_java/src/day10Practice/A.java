package day10Practice;

public class A {
static int x = 10;
int y = 11;
public void assign(int x, int y)
{
	x = x;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(this.y);
	System.out.println(y);
}
public static void main(String[] args)
{
	new A().assign(100, 99);
	System.out.println(x);
}
}
