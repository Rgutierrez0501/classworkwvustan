package hrmsapp.model;

public class Location {
	private Integer locationId;
	//HAS- A relationship
	private Address address;
	public Location() {
		
	}
	public Location(Integer locationId, Address address) {
		this.locationId = locationId;
		this.address = address;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", address=" + address + "]";
	}
	

}
