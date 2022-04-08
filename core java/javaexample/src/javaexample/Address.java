package javaexample;

public class Address {
	
	/*
	 * Instance variables--- addressId,street,city and state
	 * */
	private Integer adderessId; 
	private String street;
	private String city;
	private String state;
	/**
	 * 
	 * Below getter and setter methods are instance methos
	 */
	public Integer getAdderessId() {
		return adderessId;
	}
	
	public void setAdderessId(Integer adderessId) {
		this.adderessId = adderessId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	

}
