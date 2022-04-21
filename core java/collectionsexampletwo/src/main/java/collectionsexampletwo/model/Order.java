package collectionsexampletwo.model;

public class Order {
	private Integer orderId;
	private String orderDescription;
	private Double amount;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, String orderDescription, Double amount) {
		this.orderId = orderId;
		this.orderDescription = orderDescription;
		this.amount = amount;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDescription=" + orderDescription + ", amount=" + amount + "]";
	}
	
	
}
