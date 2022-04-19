package methodoverloadingexample;

public class MethodOVerloading {



	public static void main(String[] args) {
		Overload overload= new Overload();
		overload.test(10); // int is converted to double - Implicit data conversion takes place.
		overload.test(10,20);
		overload.test((int)5.5); //Explicit type cast 

	}

}
