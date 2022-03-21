/**
 * An abstract class is typically used to define common behaviors for derived classes to extend. 
 * Unlike a regular class, an abstract class cannot be instantiated directly.
 * 
 * To declare an abstract class , we use the abstract keyword
 * It contains one or more abstract method
 * An abstract method doesn't conatin implementation.It only defines the signature 
 * of the method without including the method body
 */
abstract class Employees{

    //Declares the firstName and lastName properties
    constructor(private firstName : string, private lastName:string){

    }
    // Abstract method. The derived class will implement the logic based on the type of employee
    abstract getSalary():number;

    getFullName():string{
        return `${this.firstName}  ${this.lastName}`;
    }

    compensationStatement():string{
        return `${this.getFullName()}  makes ${this.getSalary()} a month`;
        
    }
}

//Cannot create an instance of an abstract class.ts(2511)
//let emps = new Employees('John','Doe');

class FullTimeEmployee extends Employees{
   
    constructor(firstName : string, lastName:string, private salary: number){
        super(firstName, lastName);
    }

    getSalary(): number {
        //throw new Error("Method not implemented.");
        return this.salary;
    }
    
}

class Contractor extends Employees{
    getSalary(): number {
        //throw new Error("Method not implemented.");
        return this.rate * this.hours;
    }
    constructor(firstName : string, lastName:string, private rate: number, private hours : number){
        super(firstName, lastName);
    }
}

let john = new FullTimeEmployee('John','Doe',1200);
let jane = new Contractor('Jane','Doe',100,150);

console.log(john.compensationStatement());
console.log(jane.compensationStatement());

/**
 * Summary:-
 * Abstract classes cannot be instantiated
 * An abstract class has at least one abstract method
 * To use an abstract class, we need to inherit and provide the implementation for the abstract methods.
 * 
 */