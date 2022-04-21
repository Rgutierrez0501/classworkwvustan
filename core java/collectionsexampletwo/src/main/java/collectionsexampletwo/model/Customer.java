package collectionsexampletwo.model;

import java.util.Objects;

public class Customer {
	
	private Integer customerId;
	private String name;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(customerId, name);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(name, other.name);
	}
	

}
