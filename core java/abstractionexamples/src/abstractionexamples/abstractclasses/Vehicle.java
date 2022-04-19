package abstractionexamples.abstractclasses;

/**
 * Abstraction is process of hiding the implementation details and showing
 * only functionality to the user
 * Two ways you can achieve abstraction is java :-
 * 1. abstract class
 * 2. interface
 * 
 * Abstract class:-
 *  Must be declared with an abstract keyword
 *  It can have abstract and non-abstract method
 *  Cannot be instantiated
 *  Can have constructors and static method also
 *  It can have final methods which will force the subclass not to change the body of the method
 *
 */
//abstract class
public abstract class Vehicle {
	//abstract method
	abstract void displayInfo();//no method body and abstract keyword should be there

}
