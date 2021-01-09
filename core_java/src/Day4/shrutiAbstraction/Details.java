package Day4.shrutiAbstraction;

public abstract class Details 
{
	private int orderId;
	private String name;
	
	//constructors
	
	public Details(int orderId, String name) {
		super();
		this.orderId = orderId;
		this.name = name;
		System.out.println("In Details Constructor");
	}

	//tostring
	
	@Override
	public String toString() {
		return "Details [orderId=" + orderId + ", name=" + name + "]";
	}
	
	public abstract void amount(int amt);
	
	
	
}
