package classesexamples;

public class BookStore {
	
	private String name;
	private String location;
	private Double sellAmount;
	private static String headquarters;
	
	public BookStore() {
		// TODO Auto-generated constructor stub
		super();
	}
	public BookStore(String name, String location, Double sellAmount) {
		this.name = name;
		this.location = location;
		this.sellAmount = sellAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getSellAmount() {
		return sellAmount;
	}
	public void setSellAmount(Double sellAmount) {
		this.sellAmount = sellAmount;
	}
	
	public static String getHeadquarters() {
		headquarters="ABC Street,New York";
		return headquarters;
	}
	@Override
	public String toString() {
		return "BookStore [name=" + name + ", location=" + location + ", sellAmount=" + sellAmount + "]";
	}
	
	

}
