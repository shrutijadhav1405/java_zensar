package Day4.interfaces.combined;

public class Architect extends Human implements MathGenius, Artist
{

	@Override
	public void draw() {
		System.out.println("Architect can draw");
		
	}

	@Override
	public void calculate() {
		System.out.println("Architect can do calculations");
		
	}
	
}
