package greeter;

public class AmarilloVisitor implements Visitor {
	private String name;
	private String greeting;

	public AmarilloVisitor() {
		this.greeting = "Howdy";
	}

	@Override
	public String getGreeting() {

		return greeting;
	}

	@Override
	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
