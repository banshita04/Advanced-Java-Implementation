package lambdaexpressions.chatgpt;

public class Order {
	private int orderId;
	private String customerName;
	private double orderAmount;
	public Order(int orderId, String customerName, double orderAmount) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
}
