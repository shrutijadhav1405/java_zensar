package Day5.arrayList;

public class Orders {

		private int orderId;
		private String name;
		private double billAmt;
		
		//constructors
		
		public Orders() {
			
		}
		
		
		public Orders(int orderId, String name, double billAmt) {
			super();
			this.orderId = orderId;
			this.name = name;
			this.billAmt = billAmt;
		}
		

		//Getters & Setters
		
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBillAmt() {
			return billAmt;
		}
		public void setBillAmt(double billAmt) {
			this.billAmt = billAmt;
		}

		//toString
		
		@Override
		public String toString() {
			return "Restaurant [orderId=" + orderId + "\n, name=" + name + ", billAmt=" + billAmt + "]";
		}
		
		

}
