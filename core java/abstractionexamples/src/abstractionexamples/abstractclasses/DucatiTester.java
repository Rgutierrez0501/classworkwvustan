package abstractionexamples.abstractclasses;

public class DucatiTester {

	public static void main(String[] args) {
		//Cannot instantiate the type Bike
		//Bike bikeObj = new Bike();
		Bike bikeObj = new Ducati();
		bikeObj.run();
	}

}
